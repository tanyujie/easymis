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
import com.ieker.ierp.bsb.entity.BsbPurchase;
import com.ieker.ierp.bsb.entity.BsbPurchaseSub;
import com.ieker.ierp.bsb.entity.BsbStorage;
import com.ieker.ierp.bsb.manager.BsbPurchaseMng;
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
public class BsbPurchaseAct {

		@RequestMapping(value = "/bsb/purchase/query.jspx")
		public String query(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
			BsbPurchase param = new BsbPurchase();
			param.setOrgId(user.getOrgId());
			List<BsbPurchase> purchaseList = purchaseMng.getList(param);
			PageInfo<BsbPurchase> p=new PageInfo<BsbPurchase>(purchaseList);
			model.put("purchaseList", purchaseList);
			
			FrontUtils.frontData(request, model, site,p);
			return FrontUtils.getTplPath("/bsb/purchase/purchase_list");
		}
		@RequestMapping(value = "/bsb/purchase/search.jspx")
		public String search(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
/*			List<BsbSupplierCategory> sortList = sortMng.getList(new BsbSupplierCategory() );
			model.put("sortList", sortList);*/
			
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/purchase/purchase_search");
		}
		@RequestMapping(value = "/bsb/purchase/sub/ajax/list.jspx")
		@ResponseBody
		public Map<String, Object> listPurchaseSubByAjax( String purchaseId,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);

			BsbPurchaseSub param = new BsbPurchaseSub();
			param.setPurchaseId(purchaseId);
			List<BsbPurchaseSub> subList = purchaseMng.getPurchaseSubList(param);

			Map<String, Object> result = new HashMap<String, Object>();
			result.put("subList", subList);
			return result;
		}
		@RequestMapping(value = "/bsb/purchase/add.jspx", method = RequestMethod.GET)
		public String add(String purchaseId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			model.put("purchaseId", StrUtils.makePk());
			model.put("billDate", new Date());
			model.put("billNo", StrUtils.makePk());
			
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/purchase/purchase_add");
		}
		@RequestMapping(value = "/bsb/purchase/edit.jspx", method = RequestMethod.GET)
		public String edit(String purchaseId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbPurchase purchase=purchaseMng.findById(purchaseId);
			BsbPurchaseSub sub = new BsbPurchaseSub();
			sub.setPurchaseId(purchaseId);
			List<BsbPurchaseSub> subList = purchaseMng.getPurchaseSubList(sub);
			BsbStorage param = new BsbStorage();
			param.setOrgId(user.getOrgId());
			List<BsbStorage> storageList = storageMng.getList(param);
			model.put("storageList", storageList);
			model.put("subList", subList);
			model.put("purchase", purchase);
			
			
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/purchase/purchase_edit");
		}
		@RequestMapping(value = "/bsb/purchase/update.jspx", method = RequestMethod.POST)
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
			BsbPurchase bean=purchaseMng.findById(purchaseId);
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
			purchaseMng.update(bean, purchaseProducts);
			return "redirect:/bsb/purchase/query.jspx";
		}
		@RequestMapping(value = "/bsb/purchase/delete.jspx")
		public String del(String purchaseId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			String[] ids=purchaseId.split(",");
			for(int i=0;i<ids.length;i++)
				purchaseMng.deleteById(ids[i]);
			return "redirect:/bsb/purchase/query.jspx";
		}
		@RequestMapping(value = "/bsb/purchase/save.jspx", method = RequestMethod.POST)
	public String save(String supplierId, String subject, String billNo, String billDate, String products,
			Integer totalQuantity, Float totalAmount, Float deductionAmount, Float extraAmount, Float amount,Integer payStatus,
			String purchaseProducts, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbPurchase bean =new BsbPurchase();
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
			purchaseMng.save(bean, purchaseProducts);
			return "redirect:/bsb/purchase/query.jspx";
		}
		/**
		 * 以销定购看板
		 * @param purchaseId
		 * @param request
		 * @param response
		 * @param model
		 * @return
		 */
		@RequestMapping(value = "/bsb/purchase/purchaseBySales.jspx")
		public String purchaseView(String purchaseId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}			
			//purchaseMng.deleteById(purchaseId);
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/purchase/purchase_by_sales");
		}
		/**
		 * 
		 * @param purchaseId
		 * @param request
		 * @param response
		 * @param model
		 * @return
		 */
		@RequestMapping(value = "/bsb/purchase/autoRemedy.jspx")
		public String autoRemedy(String purchaseId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}			
			//purchaseMng.deleteById(purchaseId);
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/purchase/auto_remedy");
		}
		
		@Autowired
		private BsbPurchaseMng purchaseMng;
		@Autowired
		private BsbStorageMng storageMng;

}
