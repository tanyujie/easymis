package com.ieker.ierp.bsb.action.front;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbShipAddress;
import com.ieker.ierp.bsb.manager.BsbShipAddressMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
@Controller
public class BsbShipAddressAct {

	@RequestMapping(value = "/bsb/shipAddress/query.jspx")
	public String query(String supplierName,String type,Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		PageHelper.startPage(SimplePage.cpn(page), 999);
		BsbShipAddress param = new BsbShipAddress();
		param.setOrgId(user.getOrgId());
		List<BsbShipAddress> addressList = shipAddressMng.getList(param);
		PageInfo<BsbShipAddress> p = new PageInfo<BsbShipAddress>(addressList);
		model.put("addressList", addressList);
		FrontUtils.frontData(request, model, site, p);

		return FrontUtils.getTplPath("/bsb/settings/ship/ship_address_list");
	}
	@RequestMapping(value = "/bsb/shipAddress/add.jspx", method = RequestMethod.GET)
	public String add(String prodId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbShipAddress bean = new BsbShipAddress();
		bean.setOrgId(user.getOrgId());

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/settings/ship/ship_address_add");
	}
	@RequestMapping(value = "/bsb/shipAddress/edit.jspx", method = RequestMethod.GET)
	public String edit(String addressId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbShipAddress bean = new BsbShipAddress();
		bean.setOrgId(user.getOrgId());

		FrontUtils.frontData(request, model, site);

		return FrontUtils.getTplPath("/bsb/settings/ship/ship_address_edit");
	}
	@RequestMapping(value = "/bsb/shipAddress/update.jspx", method = RequestMethod.POST)
	public String update(String prodId,String cateId, String brandId,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("productList");
	}
	@RequestMapping(value = "/bsb/shipAddress/delete.jspx")
	public String del(String supplierId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		shipAddressMng.deleteById(supplierId);
		return "redirect:/bsb/shipAddress/query.jspx";
	}
	@RequestMapping(value = "/bsb/shipAddress/save.jspx", method = RequestMethod.POST)
	public String save(String shortName, String linkman,String phone,Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbShipAddress bean = new BsbShipAddress();
		bean.setOrgId(user.getOrgId());
		bean.setShortName(shortName);
		bean.setLinkman(linkman);
		//bean.setContacts(contacts);
		bean.setPhone(phone);
		shipAddressMng.save(bean);
		return "redirect:/bsb/shipAddress/query.jspx";
	}

	@Autowired
	private BsbShipAddressMng shipAddressMng;

}
