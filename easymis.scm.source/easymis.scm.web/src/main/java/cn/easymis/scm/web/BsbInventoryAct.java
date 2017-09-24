package com.ieker.ierp.bsb.action.front;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbInventory;
import com.ieker.ierp.bsb.entity.BsbStorageProduct;
import com.ieker.ierp.bsb.manager.BsbInventoryMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
/**
 * 拆卸单
 * @author lenovo-t
 *
 */
@Controller
public class BsbInventoryAct {
	@RequestMapping(value = "/bsb/storage/inventory/query.jspx")
	public String inventoryQuery(String businessName, String prodStatus, String prodCatId, Integer page,
			Integer pageSize, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
		BsbInventory param = new BsbInventory();
		param.setOrgId(user.getOrgId());
		List<BsbInventory> inventoryList = inventoryMng.getList(param);
		PageInfo<BsbInventory> p = new PageInfo<BsbInventory>(inventoryList);

		model.put("inventoryList", inventoryList);

		FrontUtils.frontData(request, model, site, p);
		return FrontUtils.getTplPath("/bsb/storage/inventory/inventory_list");
	}
	/**
	 * 盘点
	 * 
	 * @param businessName
	 * @param prodStatus
	 * @param prodCatId
	 * @param page
	 * @param pageSize
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/bsb/storage/inventory.jspx")
	public String inventory(String businessName, String prodStatus, String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
		BsbStorageProduct param = new BsbStorageProduct();
		param.setOrgId(user.getOrgId());
		List<BsbStorageProduct> productList =inventoryMng.getListOnStorageProduct(param);
		model.put("productList", productList);
		model.put("inventoryId", "inventoryId");
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/storage/inventory/inventory_add");
	}
	@Autowired
	private BsbInventoryMng inventoryMng;
}
