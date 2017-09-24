package com.ieker.ierp.bsb.action.front;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ieker.common.util.DateUtils;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbTransfers;
import com.ieker.ierp.bsb.manager.BsbTransfersMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
@Controller
public class BsbTransfersAct {
	@RequestMapping(value = "/bsb/storage/transfers/query.jspx")
	public String query(String leadsName, Integer follow, String leadsCatId, String contacts,Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
		BsbTransfers param = new BsbTransfers();
		param.setOrgId(user.getOrgId());
		List<BsbTransfers> transfersList = transfersMng.getList(param);
		PageInfo<BsbTransfers> p = new PageInfo<BsbTransfers>(transfersList);

		model.put("transfersList", transfersList);

		FrontUtils.frontData(request, model, site, p);
		return FrontUtils.getTplPath("/bsb/storage/transfers/transfers_list");
	}
	/**
	 * 调拨单
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
	@RequestMapping(value = "/bsb/storage/transfers/add.jspx")
	public String allot(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));

		model.put("transfersId", "transfersId");
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/storage/transfers/transfers_add");
	}
	@RequestMapping(value = "/bsb/storage/transfers/save.jspx")
	public String transfersSave(String transfersId,String billNo,String billDate,Integer transType, String storeProducts,String depict,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbTransfers param = new BsbTransfers();
		param.setTransfersId(transfersId);
		param.setBillNo(billNo);
		if(billDate!=null&& !"".equals(billDate))
			param.setBillDate(DateUtils.toDate(billDate));		
		param.setDepict(depict);
		param.setOrgId(user.getOrgId());
		param.setCreatorId(user.getStaffId());
		param.setPrintStatus(0);
		param.setCreateTime(new Date());

		transfersMng.save(param, storeProducts);
		return "redirect:/bsb/transfers/query.jspx";
	}
	@Autowired
	private BsbTransfersMng transfersMng;
}
