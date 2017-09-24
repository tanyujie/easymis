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
import com.ieker.common.util.StrUtils;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbProduct;
import com.ieker.ierp.bsb.manager.BsbProductMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
/**
 * 
 * @author lenovo-t
 * 商品管理
 */
@Controller
public class BsbProductAct {

		@RequestMapping(value = "/bsb/product/query.jspx")
		public String query(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
			BsbProduct param = new BsbProduct();
			param.setOrgId(user.getOrgId());
			List<BsbProduct> productList = productMng.getList(param);
			PageInfo<BsbProduct> p=new PageInfo<BsbProduct>(productList);
			model.put("productList", productList);
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/product/product_list");
		}
		@RequestMapping(value = "/bsb/product/ajax/query.jspx")
		@ResponseBody
		public Map<String, Object> queryByAjax( Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			Map<String, Object> result = new HashMap<String, Object>();
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return result;
			}
			PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
			BsbProduct param = new BsbProduct();
			param.setOrgId(user.getOrgId());
			List<BsbProduct> productList = productMng.getList(param);
			PageInfo<BsbProduct> p=new PageInfo<BsbProduct>(productList);

	
			result.put("pageInfo", p);
			return result;
		}
		
		@RequestMapping(value = "/bsb/product/add.jspx")
		public String add(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}

			
			model.put("prodId", StrUtils.makePk());

			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/product/product_add");
		}
		@RequestMapping(value = "/bsb/product/edit.jspx", method = RequestMethod.GET)
		public String edit(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			BsbProduct bean = productMng.findById(prodId);
			model.put("product", bean);
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/product/product_edit");
		}
		@RequestMapping(value = "/bsb/product/copy.jspx", method = RequestMethod.GET)
		public String copy(String prodId, 
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			BsbProduct bean = productMng.findById(prodId);
			model.put("product", bean);
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/product/product_copy");
		}
		@RequestMapping(value = "/bsb/product/update.jspx", method = RequestMethod.POST)
		public String update(String prodId,String merchantProdId, String prodName, String merchantProdBarCode, String specs,
				String categoryId, String storageId, String unitId, Float salePrice, Float wholesalePrice, Float vipPrice,
				Float discountRate1, Float discountRate2, Float purchasePrice, String depict, Integer inventoryWarn,
				Integer minInventory, Integer maxInventory, HttpServletRequest request, HttpServletResponse response,
				ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbProduct bean = productMng.findById(prodId);
			bean.setMerchantProdId(merchantProdId);
			bean.setProdName(prodName);
			bean.setMerchantProdBarCode(merchantProdBarCode);
			bean.setSpecs(specs);
			bean.setCategoryId(categoryId);
			bean.setStorageId(storageId);
			bean.setUnitId(unitId);
			bean.setSalePrice(salePrice);
			bean.setWholesalePrice(wholesalePrice);
			bean.setVipPrice(vipPrice);
			bean.setMinInventory(minInventory);
			bean.setMaxInventory(maxInventory);
			productMng.update(bean);
			FrontUtils.frontData(request, model, site);
			return "redirect:/bsb/product/query.jspx";
		}
		@RequestMapping(value = "/bsb/product/save.jspx", method = RequestMethod.POST)
	public String save(String merchantProdId, String prodName, String merchantProdBarCode, String specs,
			String categoryId, String storageId, String unitId, Float salePrice, Float wholesalePrice, Float vipPrice,
			Float discountRate1, Float discountRate2, Float purchasePrice, String depict, Integer inventoryWarn,
			Integer minInventory, Integer maxInventory, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbProduct bean = new BsbProduct();
			bean.setOrgId(user.getOrgId());
			bean.setCreateTime(new Date());
			bean.setMerchantProdId(merchantProdId);
			bean.setProdName(prodName);
			bean.setMerchantProdBarCode(merchantProdBarCode);
			bean.setSpecs(specs);
			bean.setCategoryId(categoryId);
			bean.setStorageId(storageId);
			bean.setUnitId(unitId);
			bean.setSalePrice(salePrice);
			bean.setWholesalePrice(wholesalePrice);
			bean.setVipPrice(vipPrice);
			bean.setMinInventory(minInventory);
			bean.setMaxInventory(maxInventory);
			
			productMng.save(bean);
			FrontUtils.frontData(request, model, site);
			return "redirect:/bsb/product/query.jspx";
		}

		@Autowired
		private BsbProductMng productMng;

}
