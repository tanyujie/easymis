package com.ieker.ierp.bsb.action.front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.entity.Organize;
import com.ieker.ierp.core.manager.OrganizeMng;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
@Controller
public class BsbParameterAct {
	/**
	 * @see 系统参数
	 * @param storageNo
	 * @param storageName
	 * @param depict
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/bsb/settings/system/parameter.jspx")
	public String systemParameter(String storageNo,  String storageName,String depict,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		Organize organize = organizeMng.findByIdOnInfo(user.getOrgId());

		model.put("organize", organize);

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/settings/system/base_parameter");
	}
	@RequestMapping(value = "/bsb/settings/system/parameter/update.jspx")
	public String update(String orgId, String orgName, String address, String phone, String fax, String zip,
			Integer qtyPlaces, Integer pricePlaces, String valMethods, Integer requiredCheckStore,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		Organize organize = organizeMng.findByIdOnInfo(orgId);
		organize.setOrgName(orgName);
		organize.setAddress(address);
		organize.setPhone(phone);
		organize.setFax(fax);
		organize.setZip(zip);
		organize.setQtyPlaces(qtyPlaces);
		organize.setPricePlaces(pricePlaces);
		organize.setValMethods(valMethods);
		if(requiredCheckStore!=null)
			organize.setRequiredCheckStore(requiredCheckStore);
		else
			organize.setRequiredCheckStore(0);
		organizeMng.update(organize);
		FrontUtils.frontData(request, model, site);
		return "redirect:/";
	}
	@Autowired
	private OrganizeMng organizeMng;
}
