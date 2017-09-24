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
import com.ieker.ierp.bsb.entity.BsbStorage;
import com.ieker.ierp.bsb.manager.BsbStorageMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
@Controller
public class ScmAct {

	/**
	 * 组装单
	 */
	@RequestMapping(value = "/bsb/scm/storageOutPackage.jspx")
	public String storageOutPackage(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
		BsbStorage param = new BsbStorage();

		List<BsbStorage> purchaseList = storeMng.getList(param);
		PageInfo<BsbStorage> p=new PageInfo<BsbStorage>(purchaseList);
		model.put("purchaseList", purchaseList);

		
		
		FrontUtils.frontData(request, model, site,p);
		return FrontUtils.getTplPath("/bsb/package/return_list");
	}
	/**
	 * 拆卸单
	 */
	@RequestMapping(value = "/bsb/scm/storageDemount.jspx")
	public String storageDemount(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
		BsbStorage param = new BsbStorage();

		List<BsbStorage> purchaseList = storeMng.getList(param);
		PageInfo<BsbStorage> p=new PageInfo<BsbStorage>(purchaseList);
		model.put("purchaseList", purchaseList);

		
		
		FrontUtils.frontData(request, model, site,p);
		return FrontUtils.getTplPath("/bsb/scm/return_list");
	}
	@Autowired
	private BsbStorageMng storeMng;
}
