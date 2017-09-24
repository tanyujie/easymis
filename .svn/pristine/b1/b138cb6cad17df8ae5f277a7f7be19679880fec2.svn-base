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
import com.ieker.common.util.StrUtils;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbSalesBack;
import com.ieker.ierp.bsb.manager.BsbSalesBackMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
@Controller
public class BsbSalesBackAct {

		@RequestMapping(value = "/bsb/sales/back/query.jspx")
		public String query(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
			BsbSalesBack bean = new BsbSalesBack();
			bean.setOrgId(user.getOrgId());
			List<BsbSalesBack> backList = salesBackMng.getList(bean);
			PageInfo<BsbSalesBack> p = new PageInfo<BsbSalesBack>(backList);

			model.put("backList", backList);
			FrontUtils.frontData(request, model, site, p);
			return FrontUtils.getTplPath("/bsb/sales/back/back_list");
		}
		@RequestMapping(value = "/bsb/sales/back/search.jspx")
		public String search(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
/*			List<BsbSupplierCategory> sortList = sortMng.getList(new BsbSupplierCategory() );
			model.put("sortList", sortList);*/
			
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/sales/back/back_search");
		}
		@RequestMapping(value = "/bsb/sales/back/add.jspx", method = RequestMethod.GET)
		public String add(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);

			
			model.put("prodId", StrUtils.makePk());
			model.put("billDate", new Date());

			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/sales/back/back_add");
		}
		@RequestMapping(value = "/bsb/sales/back/edit.jspx", method = RequestMethod.GET)
		public String edit(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
		
	
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/sales/back/back_edit");
		}
		@RequestMapping(value = "/bsb/sales/back/update.jspx", method = RequestMethod.POST)
		public String update(String prodId,String cateId, String brandId,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);


			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("productList");
		}
		@RequestMapping(value = "/bsb/sales/back/save.jspx", method = RequestMethod.POST)
		public String save(String prodCategoryId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
		



			//MemberConfig mcfg = site.getConfig().getMemberConfig();
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("productList");
		}

		@Autowired
		private BsbSalesBackMng salesBackMng;

}
