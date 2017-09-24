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
import com.ieker.ierp.bsb.entity.BsbProductCategory;
import com.ieker.ierp.bsb.manager.BsbProductCategoryMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
/**
 * 
 * @author lenovo-t
 * 商品类别管理
 */
@Controller
public class BsbProductCategoryAct {

		@RequestMapping(value = "/bsb/product/category/query.jspx")
		public String query(String prodStatus,String prodCatId, Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			PageHelper.startPage(SimplePage.cpn(page), 999);
			BsbProductCategory param = new BsbProductCategory();
			param.setOrgId(user.getOrgId());
			List<BsbProductCategory> categoryList = categoryMng.getList(param);
			PageInfo<BsbProductCategory> p = new PageInfo<BsbProductCategory>(categoryList);
			model.put("categoryList", categoryList);
			FrontUtils.frontData(request, model, site, p);
			return FrontUtils.getTplPath("/bsb/product/category/category_list");
		}
		@RequestMapping(value = "/bsb/product/category/ajax/query.jspx")
		@ResponseBody
		public Map<String, Object> queryByAjax( String customerName,Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
			BsbProductCategory param = new BsbProductCategory();
			param.setOrgId(user.getOrgId());
			List<BsbProductCategory> categoryList = categoryMng.getList(param);

			Map<String, Object> result = new HashMap<String, Object>();
			result.put("categoryList", categoryList);
			return result;
		}

		@RequestMapping(value = "/bsb/product/category/add.jspx", method = RequestMethod.GET)
		public String add(Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbProductCategory bean = new BsbProductCategory();
			bean.setOrgId(user.getOrgId());
			List<BsbProductCategory> categoryList=categoryMng.getTopList(bean);
			model.put("categoryList", categoryList);

			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/product/category/category_add");
		}
		@RequestMapping(value = "/bsb/product/category/edit.jspx", method = RequestMethod.GET)
		public String edit(String categoryId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbProductCategory bean = new BsbProductCategory();
			bean.setOrgId(user.getOrgId());
			List<BsbProductCategory> categoryList=categoryMng.getTopList(bean);
			bean=categoryMng.findById(categoryId);
			
			model.put("category", bean);	
			model.put("categoryList", categoryList);
	
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/product/category/category_edit");
		}
		@RequestMapping(value = "/bsb/product/category/update.jspx", method = RequestMethod.POST)
		public String update(String categoryId,String categoryName, String parentId,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbProductCategory bean = categoryMng.findById(categoryId);
			bean.setOrgId(user.getOrgId());
			bean.setCategoryName(categoryName);
			bean.setParentId(parentId);
			bean.setLevel(categoryMng.findById(parentId).getLevel()+1);
			categoryMng.update(bean);

			FrontUtils.frontData(request, model, site);
			return "redirect:/bsb/product/category/query.jspx";
		}
		@RequestMapping(value = "/bsb/product/category/delete.jspx")
		public String delete(String categoryId,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			categoryMng.deleteById(categoryId);
			FrontUtils.frontData(request, model, site);
			return "redirect:/bsb/product/category/query.jspx";
		}
		@RequestMapping(value = "/bsb/product/category/save.jspx", method = RequestMethod.POST)
		public String save(String categoryName, String parentId,Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbProductCategory bean = new BsbProductCategory();
			bean.setOrgId(user.getOrgId());
			bean.setCategoryName(categoryName);
			bean.setParentId(parentId);
			bean.setLevel(categoryMng.findById(parentId).getLevel()+1);
			bean.setLeaf(1);
			categoryMng.save(bean);
			return "redirect:/bsb/product/category/query.jspx";
		}

		@Autowired
		private BsbProductCategoryMng categoryMng;

}
