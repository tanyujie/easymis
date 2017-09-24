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
 * 仓库报表
 * @author lenovo-t
 *
 */
@Controller
public class BsbStorageReportAct {

	@RequestMapping(value = "/bsb/storage/report/product-balance.jspx")
	public String productBalance(String businessName, String prodStatus, String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/storage/report/product_balance");
	}
	
	@RequestMapping(value = "/bsb/storage/report/product-flow-detail.jspx")
	public String productFlowDetail(String businessName, String prodStatus, String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/storage/report/product_flow_detail");
	}
	
	@RequestMapping(value = "/bsb/storage/report/product-flow-summary.jspx")
	public String productFlowSummary(String businessName, String prodStatus, String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/storage/report/product_flow_summary");
	}
}
