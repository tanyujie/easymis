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
import com.ieker.common.util.StrUtils;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbProductUnit;
import com.ieker.ierp.bsb.manager.BsbProductUnitMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
/**
 * 计量单位
 * @author lenovo-t
 *
 */
@Controller
public class BsbProductUnitAct {

	@RequestMapping(value = "/bsb/product/unit/query.jspx")
	public String query(String prodStatus,String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		PageHelper.startPage(SimplePage.cpn(page), 999);
		BsbProductUnit param = new BsbProductUnit();
		param.setOrgId(user.getOrgId());
		List<BsbProductUnit> unitList = unitMng.getList(param);
		PageInfo<BsbProductUnit> p = new PageInfo<BsbProductUnit>(unitList);
		model.put("unitList", unitList);
		FrontUtils.frontData(request, model, site, p);
		return FrontUtils.getTplPath("/bsb/product/unit/unit_list");
	}
	@RequestMapping(value = "/bsb/product/unit/ajax/query.jspx")
	@ResponseBody
	public Map<String, Object> queryByAjax( String customerName,Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
		BsbProductUnit param = new BsbProductUnit();
		param.setOrgId(user.getOrgId());
		List<BsbProductUnit> unitList = unitMng.getList(param);

		Map<String, Object> result = new HashMap<String, Object>();
		result.put("unitList", unitList);
		return result;
	}
	@RequestMapping(value = "/bsb/product/unit/add.jspx", method = RequestMethod.GET)
	public String add(String prodId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/product/unit/unit_add");
	}
	@RequestMapping(value = "/bsb/product/unit/edit.jspx", method = RequestMethod.GET)
	public String edit(String unitId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbProductUnit bean = unitMng.findById(unitId);
		model.put("unit", bean);
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/product/unit/unit_edit");
	}
	@RequestMapping(value = "/bsb/product/unit/update.jspx", method = RequestMethod.POST)
	public String update(String unitId,String unitName, String depict,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbProductUnit bean = unitMng.findById(unitId);
		bean.setOrgId(user.getOrgId());
		bean.setUnitName(unitName);
		bean.setDepict(depict);
		unitMng.save(bean);
		FrontUtils.frontData(request, model, site);
		return "redirect:/bsb/product/unit/query.jspx";
	}
	@RequestMapping(value = "/bsb/product/unit/delete.jspx")
	public String delete(String unitId,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		unitMng.deleteById(unitId);
		FrontUtils.frontData(request, model, site);
		return "redirect:/bsb/product/unit/query.jspx";
	}
	@RequestMapping(value = "/bsb/product/unit/save.jspx", method = RequestMethod.POST)
	public String save(String unitName, String depict,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbProductUnit bean = new BsbProductUnit();
		bean.setOrgId(user.getOrgId());
		bean.setUnitName(unitName);
		bean.setDepict(depict);
		unitMng.save(bean);
		FrontUtils.frontData(request, model, site);
		return "redirect:/bsb/product/unit/query.jspx";
	}

	@Autowired
	private BsbProductUnitMng unitMng;

}
