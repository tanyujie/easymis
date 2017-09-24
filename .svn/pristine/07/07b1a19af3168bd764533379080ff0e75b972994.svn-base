package com.ieker.ierp.bsb.action.front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;

/**
 * 采购报表
 * @author lenovo-t
 *
 */
@Controller
public class BsbPurchaseReportAct {
	@RequestMapping(value = "/bsb/purchase/report/detail.jspx")
	public String detail(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/purchase/report/detail");
	}
	@RequestMapping(value = "/bsb/purchase/report/summary.jspx")
	public String summary(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/purchase/report/summary");
	}
	@RequestMapping(value = "/bsb/purchase/report/summary-supply.jspx")
	public String summarySupply(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/purchase/report/summary_supply");
	}
	@RequestMapping(value = "/bsb/purchase/report/pay-detail.jspx")
	public String payDetail(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/purchase/report/pay_detail");
	}
	
}
