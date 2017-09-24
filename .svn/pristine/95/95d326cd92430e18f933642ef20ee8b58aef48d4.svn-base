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
import com.ieker.ierp.bsb.entity.BsbProductBrand;
import com.ieker.ierp.bsb.manager.BsbProductBrandMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
/**
 * 
 * @author lenovo-t
 * 商品品牌管理
 */
@Controller
public class BsbProductBrandAct {

		@RequestMapping(value = "/bsb/product/brand/query.jspx")
		public String query(String prodStatus,String prodCatId, Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			PageHelper.startPage(SimplePage.cpn(page), 999);
			BsbProductBrand param = new BsbProductBrand();
			param.setOrgId(user.getOrgId());
			List<BsbProductBrand> brandList = brandMng.getList(param);
			PageInfo<BsbProductBrand> p = new PageInfo<BsbProductBrand>(brandList);
			model.put("brandList", brandList);
			FrontUtils.frontData(request, model, site, p);
			return FrontUtils.getTplPath("/bsb/product/brand/brand_list");
		}
		@RequestMapping(value = "/bsb/product/brand/ajax/query.jspx")
		@ResponseBody
		public Map<String, Object> queryByAjax( String customerName,Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
			BsbProductBrand param = new BsbProductBrand();
			param.setOrgId(user.getOrgId());
			List<BsbProductBrand> brandList = brandMng.getList(param);

			Map<String, Object> result = new HashMap<String, Object>();
			result.put("brandList", brandList);
			return result;
		}

		@RequestMapping(value = "/bsb/product/brand/add.jspx", method = RequestMethod.GET)
		public String add(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}

			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/product/brand/brand_add");
		}
		@RequestMapping(value = "/bsb/product/brand/edit.jspx")
		public String edit(String brandId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbProductBrand bean = brandMng.findById(brandId);
			model.put("brand", bean);
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/product/brand/brand_edit");
		}
		@RequestMapping(value = "/bsb/product/brand/update.jspx", method = RequestMethod.POST)
		public String update(String brandId,String brandNo, String brandName,String depict,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbProductBrand bean = brandMng.findById(brandId);
			bean.setOrgId(user.getOrgId());
			bean.setBrandNo(brandNo);
			bean.setBrandName(brandName);
			bean.setDepict(depict);
			brandMng.update(bean);

			FrontUtils.frontData(request, model, site);
			return "redirect:/bsb/product/brand/query.jspx";
		}
		@RequestMapping(value = "/bsb/product/brand/delete.jspx")
		public String delete(String brandId,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			brandMng.deleteById(brandId);
			FrontUtils.frontData(request, model, site);
			return "redirect:/bsb/product/brand/query.jspx";
		}
		@RequestMapping(value = "/bsb/product/brand/save.jspx", method = RequestMethod.POST)
		public String save(String brandNo,String brandName,String depict, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbProductBrand bean = new BsbProductBrand();
			bean.setOrgId(user.getOrgId());
			bean.setBrandNo(brandNo);
			bean.setBrandName(brandName);
			brandMng.save(bean);
			FrontUtils.frontData(request, model, site);
			return "redirect:/bsb/product/brand/query.jspx";
		}

		@Autowired
		private BsbProductBrandMng brandMng;

}
