package com.ieker.ierp.bsb.action.front;

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
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbProductCategory;
import com.ieker.ierp.bsb.entity.BsbSupplier;
import com.ieker.ierp.bsb.entity.BsbSupplierCategory;
import com.ieker.ierp.bsb.manager.BsbSupplierCategoryMng;
import com.ieker.ierp.bsb.manager.BsbSupplierMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;

/**
 * 
 * @author lenovo-t
 *@see 供应商类别
 */
@Controller
public class BsbSupplierCategoryAct {

	@RequestMapping(value = "/bsb/supplier/category/query.jspx")
	public String query(String supplierName,String type,Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		PageHelper.startPage(SimplePage.cpn(page), 999);
		BsbSupplierCategory param = new BsbSupplierCategory();
		param.setOrgId(user.getOrgId());
		List<BsbSupplierCategory> categoryList = categoryMng.getList(param);
		PageInfo<BsbSupplierCategory> p = new PageInfo<BsbSupplierCategory>(categoryList);
		model.put("categoryList", categoryList);
		FrontUtils.frontData(request, model, site, p);

		return FrontUtils.getTplPath("/bsb/supplier/category/category_list");
	}
	@RequestMapping(value = "/bsb/supplier/category/add.jspx", method = RequestMethod.GET)
	public String add(String prodId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbSupplierCategory bean = new BsbSupplierCategory();
		bean.setOrgId(user.getOrgId());
		List<BsbSupplierCategory> categoryList=categoryMng.getTopList(bean);
		model.put("categoryList", categoryList);
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/supplier/category/category_add");
	}
	@RequestMapping(value = "/bsb/supplier/category/edit.jspx", method = RequestMethod.GET)
	public String edit(String categoryId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbSupplierCategory bean = new BsbSupplierCategory();
		bean.setOrgId(user.getOrgId());
		List<BsbSupplierCategory> categoryList=categoryMng.getTopList(bean);
		
		model.put("category", categoryMng.findById(categoryId));	
		model.put("categoryList", categoryList);
		FrontUtils.frontData(request, model, site);

		return FrontUtils.getTplPath("/bsb/supplier/category/category_edit");
	}
	@RequestMapping(value = "/bsb/supplier/category/update.jspx", method = RequestMethod.POST)
	public String update(String prodId,String cateId, String brandId,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("productList");
	}
	@RequestMapping(value = "/bsb/supplier/category/delete.jspx")
	public String del(String supplierId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		supplierMng.deleteById(supplierId);
		return "redirect:/bsb/supplier/category/query.jspx";
	}
	@RequestMapping(value = "/bsb/supplier/category/save.jspx", method = RequestMethod.POST)
	public String save(String supplierName, String contacts,String phone,Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		BsbSupplier bean = new BsbSupplier();
		bean.setOrgId(user.getOrgId());
		bean.setSupplierName(supplierName);
		bean.setCreatorId(user.getStaffId());
		//bean.setContacts(contacts);
		bean.setPhone(phone);
		supplierMng.save(bean);
		return "redirect:/bsb/supplier/category/query.jspx";
	}

	@Autowired
	private BsbSupplierMng supplierMng;
	@Autowired
	private BsbSupplierCategoryMng categoryMng;

}
