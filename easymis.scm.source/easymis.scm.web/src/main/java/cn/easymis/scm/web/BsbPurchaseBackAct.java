package com.ieker.ierp.bsb.action.front;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ieker.common.util.DateUtils;
import com.ieker.common.util.StrUtils;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbPurchaseBack;
import com.ieker.ierp.bsb.manager.BsbPurchaseBackMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
/**
 * 购货退货单
 * @author lenovo-t
 *
 */
@Controller
public class BsbPurchaseBackAct {

		@RequestMapping(value = "/bsb/purchase/back/query.jspx")
		public String query(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
			BsbPurchaseBack param = new BsbPurchaseBack();
			param.setOrgId(user.getOrgId());
			List<BsbPurchaseBack> backList = backMng.getList(param);
			PageInfo<BsbPurchaseBack> p=new PageInfo<BsbPurchaseBack>(backList);
			model.put("backList", backList);

			
			
			FrontUtils.frontData(request, model, site,p);
			return FrontUtils.getTplPath("/bsb/purchase/back/back_list");
		}
		@RequestMapping(value = "/bsb/purchase/back/search.jspx")
		public String search(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
/*			List<BsbSupplierCategory> sortList = sortMng.getList(new BsbSupplierCategory() );
			model.put("sortList", sortList);*/
			
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/purchase/back/back_search");
		}
		@RequestMapping(value = "/bsb/purchase/back/add.jspx", method = RequestMethod.GET)
		public String add(String purchaseId, 
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			model.put("backId", StrUtils.makePk());
			model.put("billNo", StrUtils.makePk());
			model.put("purchaseId", purchaseId);		

			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/purchase/back/back_add");
		}
		@RequestMapping(value = "/bsb/purchase/back/edit.jspx", method = RequestMethod.GET)
		public String edit(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}		
			return FrontUtils.getTplPath("/bsb/purchase/back/back_edit");
		}
		@RequestMapping(value = "/bsb/purchase/back/update.jspx", method = RequestMethod.POST)
		public String update(String prodId,String cateId, String brandId,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}


			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("productList");
		}
		@RequestMapping(value = "/bsb/purchase/back/delete.jspx")
		public String delete(String backId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			String[] ids=backId.split(",");
			for(int i=0;i<ids.length;i++)
				backMng.deleteById(ids[i]);
			return "redirect:/bsb/purchase/back/query.jspx";
		}
		@RequestMapping(value = "/bsb/purchase/back/save.jspx", method = RequestMethod.POST)
		public String save(String supplierId,String billDate, String billNo,String purchaseId,String products,String purchaseProducts,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbPurchaseBack bean =new BsbPurchaseBack();
			bean.setOrgId(user.getOrgId());
			bean.setCreatorId(user.getStaffId());			
			if(billDate!=null&& !"".equals(billDate))
				bean.setBillDate(DateUtils.toDate(billDate));
			bean.setBillNo(billNo);
			bean.setCreateTime(new Date());
			bean.setSupplierId(supplierId);
			bean.setAmount(new Float(10));
			bean.setPurchaseId(purchaseId);
			backMng.save(bean, purchaseProducts);
			System.out.println(products);
			return "redirect:/bsb/purchase/back/query.jspx";
		}

		@Autowired
		private BsbPurchaseBackMng backMng;

}
