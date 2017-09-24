package com.ieker.ierp.bsb.action.front;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ieker.common.util.DateUtils;
import com.ieker.common.util.StrUtils;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbPurchaseOrder;
import com.ieker.ierp.bsb.entity.BsbPurchaseOrderSub;
import com.ieker.ierp.bsb.entity.BsbStorage;
import com.ieker.ierp.bsb.entity.BsbSupplierCategory;
import com.ieker.ierp.bsb.manager.BsbPurchaseOrderMng;
import com.ieker.ierp.bsb.manager.BsbStorageMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
/**
 * 采购单/进货单
 * @author lenovo-t
 *
 */
@Controller
public class BsbPurchaseOrderAct {

		@RequestMapping(value = "/bsb/purchase/order/query.jspx")
		public String query(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
			BsbPurchaseOrder param = new BsbPurchaseOrder();
			param.setOrgId(user.getOrgId());
			List<BsbPurchaseOrder> orderList = purchaseOrderMng.getList(param);
			PageInfo<BsbPurchaseOrder> p=new PageInfo<BsbPurchaseOrder>(orderList);
			model.put("orderList", orderList);
			model.put("beginDate", DateUtils.getSpecficMonthStart());
			model.put("endDate", new Date());
			FrontUtils.frontData(request, model, site,p);
			return FrontUtils.getTplPath("/bsb/purchase/order/purchase_order_list");
		}
		@RequestMapping(value = "/bsb/purchase/order/search.jspx")
		public String search(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
/*			List<BsbSupplierCategory> sortList = sortMng.getList(new BsbSupplierCategory() );
			model.put("sortList", sortList);*/
			
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/purchase/order/purchase_order_search");
		}
		@RequestMapping(value = "/bsb/purchase/order/sub/ajax/list.jspx")
		@ResponseBody
		public Map<String, Object> listPurchaseSubByAjax( String purchaseOrderId,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);

			BsbPurchaseOrderSub param = new BsbPurchaseOrderSub();
			param.setPurchaseOrderId(purchaseOrderId);
			List<BsbPurchaseOrderSub> subList = purchaseOrderMng.getPurchaseOrderSubList(param);

			Map<String, Object> result = new HashMap<String, Object>();
			result.put("subList", subList);
			return result;
		}
		@RequestMapping(value = "/bsb/purchase/order/add.jspx", method = RequestMethod.GET)
		public String add(String purchaseId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			model.put("purchaseOrderId", StrUtils.makePk());
			model.put("billDate", new Date());
			model.put("billNo", StrUtils.makePk());
			
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/purchase/order/purchase_order_add");
		}
		@RequestMapping(value = "/bsb/purchase/order/edit.jspx", method = RequestMethod.GET)
		public String edit(String purchaseOrderId, 
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbPurchaseOrder purchase=purchaseOrderMng.findById(purchaseOrderId);
			BsbPurchaseOrderSub sub = new BsbPurchaseOrderSub();
			sub.setPurchaseOrderId(purchaseOrderId);
			List<BsbPurchaseOrderSub> subList = purchaseOrderMng.getPurchaseOrderSubList(sub);
			BsbStorage param = new BsbStorage();
			param.setOrgId(user.getOrgId());
			List<BsbStorage> storageList = storageMng.getList(param);
			model.put("storageList", storageList);
			model.put("subList", subList);
			model.put("purchase", purchase);
			
			
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/purchase/order/purchase_order_edit");
		}
		@RequestMapping(value = "/bsb/purchase/order/update.jspx", method = RequestMethod.POST)
		public String update(String purchaseId,String supplierId, String subject, String billNo, String billDate, 
				Integer totalQuantity, Float totalAmount, Float deductionAmount, Float extraAmount, Float amount,Integer payStatus,
				String purchaseProducts,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbPurchaseOrder bean=purchaseOrderMng.findById(purchaseId);
			bean.setOrgId(user.getOrgId());
			bean.setCreatorId(user.getStaffId());
			bean.setCreateTime(new Date());
			if(billDate!=null&& !"".equals(billDate))
				bean.setBillDate(DateUtils.toDate(billDate));
			bean.setSubject(subject);
			bean.setStatus(1);
			bean.setBillNo(billNo);
			bean.setSupplierId(supplierId);
			bean.setTotalQuantity(totalQuantity);
			bean.setTotalAmount(totalAmount);
			bean.setDeductionAmount(deductionAmount);
			bean.setExtraAmount(extraAmount);
			bean.setAmount(amount);
			purchaseOrderMng.update(bean, purchaseProducts);
			return "redirect:/bsb/purchase/order/query.jspx";
		}
		@RequestMapping(value = "/bsb/purchase/order/delete.jspx")
		public String del(String purchaseId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			String[] ids=purchaseId.split(",");
			for(int i=0;i<ids.length;i++)
				purchaseOrderMng.deleteById(ids[i]);
			return "redirect:/bsb/purchase/order/query.jspx";
		}
		@RequestMapping(value = "/bsb/purchase/order/save.jspx", method = RequestMethod.POST)
	public String save(String supplierId, String subject, String billNo, String billDate, String products,
			Integer totalQuantity, Float totalAmount, Float deductionAmount, Float extraAmount, Float amount,Integer payStatus,
			String purchaseProducts, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbPurchaseOrder bean =new BsbPurchaseOrder();
			bean.setOrgId(user.getOrgId());
			bean.setCreatorId(user.getStaffId());
			bean.setCreateTime(new Date());
			if(billDate!=null&& !"".equals(billDate))
				bean.setBillDate(DateUtils.toDate(billDate));
			bean.setSubject(subject);
			bean.setStatus(1);
			bean.setBillNo(billNo);
			bean.setSupplierId(supplierId);
			bean.setTotalQuantity(totalQuantity);
			bean.setTotalAmount(totalAmount);
			bean.setDeductionAmount(deductionAmount);
			bean.setExtraAmount(extraAmount);
			bean.setAmount(amount);
			bean.setPayStatus(payStatus);
			purchaseOrderMng.save(bean, purchaseProducts);
			return "redirect:/bsb/purchase/order/query.jspx";
		}

		
		@Autowired
		private BsbPurchaseOrderMng purchaseOrderMng;
		@Autowired
		private BsbStorageMng storageMng;

}
