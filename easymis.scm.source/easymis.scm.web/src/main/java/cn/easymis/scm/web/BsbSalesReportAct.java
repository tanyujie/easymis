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
 * 销售报表
 * @author lenovo-t
 *
 */
@Controller
public class BsbSalesReportAct {
	@RequestMapping(value = "/bsb/sales/report/detail.jspx")
	public String productBalance(String businessName, String prodStatus, String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/sales/report/detail");
	}

	@RequestMapping(value = "/bsb/sales/report/summary.jspx")
	public String salesSummary(String businessName, String prodStatus, String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/sales/report/summary");
	}

	@RequestMapping(value = "/bsb/sales/report/summary-customer.jspx")
	public String salesSummaryCustomer(String businessName, String prodStatus, String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/sales/report/summary_customer");
	}
	@RequestMapping(value = "/bsb/sales/report/summary-sales.jspx")
	public String salesSummarySales(String businessName, String prodStatus, String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/sales/report/summary_sales");
	}

	@RequestMapping(value = "/bsb/sales/report/receipt-detail.jspx")
	public String saleReceiptDetail(String businessName, String prodStatus, String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/sales/report/receipt_detail");
	}

	@RequestMapping(value = "/bsb/sales/report/contact-debt.jspx")
	public String contactDebt(String businessName, String prodStatus, String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/sales/report/contact_debt");
	}

	@RequestMapping(value = "/bsb/sales/report/profit-detail.jspx")
	public String saleProfitDetail(String businessName, String prodStatus, String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/sales/report/profit_detail");
	}
	@RequestMapping(value = "/bsb/sales/report/rank-detail.jspx")
	public String rankDetail(String businessName, String prodStatus, String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/sales/report/rank_detail");
	}
}
