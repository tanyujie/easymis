package com.ieker.ierp.bsb.action.front;

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
import com.ieker.common.web.page.SimplePage;
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
 * 供应商管理
 */
@Controller
public class BsbSupplierAct {

	@RequestMapping(value = "/bsb/supplier/query.jspx")
	public String query(String supplierName,String type,Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		PageHelper.startPage(SimplePage.cpn(page), 999);
		BsbSupplier param = new BsbSupplier();
		param.setOrgId(user.getOrgId());
		List<BsbSupplier> supplierList = supplierMng.getList(param);
		PageInfo<BsbSupplier> p = new PageInfo<BsbSupplier>(supplierList);
		model.put("supplierList", supplierList);
		FrontUtils.frontData(request, model, site, p);

		return FrontUtils.getTplPath("/bsb/supplier/supplier_list");
	}
	@RequestMapping(value = "/bsb/supplier/ajax/query.jspx")
	@ResponseBody
	public Map<String, Object> queryByAjax( Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
		BsbSupplier param = new BsbSupplier();
		param.setOrgId(user.getOrgId());
		List<BsbSupplier> supplierList = supplierMng.getList(param);
		PageInfo<BsbSupplier> p=new PageInfo<BsbSupplier>(supplierList);

		Map<String, Object> result = new HashMap<String, Object>();
		result.put("pageInfo", p);
		return result;
	}
	@RequestMapping(value = "/bsb/supplier/add.jspx", method = RequestMethod.GET)
	public String add(String prodId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		List<BsbSupplierCategory> sortList = sortMng.getList(new BsbSupplierCategory() );
		model.put("sortList", sortList);
		
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/supplier/supplier_add");
	}
	@RequestMapping(value = "/bsb/supplier/edit.jspx", method = RequestMethod.GET)
	public String edit(String prodId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);

		return FrontUtils.getTplPath("/bsb/supplier/supplier_edit");
	}
	@RequestMapping(value = "/bsb/supplier/update.jspx", method = RequestMethod.POST)
	public String update(String prodId,String cateId, String brandId,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("productList");
	}
	@RequestMapping(value = "/bsb/supplier/delete.jspx")
	public String del(String supplierId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		supplierMng.deleteById(supplierId);
		return "redirect:/bsb/supplier/query.jspx";
	}
	@RequestMapping(value = "/bsb/supplier/save.jspx", method = RequestMethod.POST)
	public String save(String supplierName, String contacter,String phone,String depict,Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		BsbSupplier bean = new BsbSupplier();
		bean.setOrgId(user.getOrgId());
		bean.setSupplierName(supplierName);
		bean.setCreatorId(user.getStaffId());
		bean.setContacter(contacter);
		bean.setPhone(phone);
		bean.setDepict(depict);
		supplierMng.save(bean);
		return "redirect:/bsb/supplier/query.jspx";
	}

	@Autowired
	private BsbSupplierMng supplierMng;
	@Autowired
	private BsbSupplierCategoryMng sortMng;

}
