package com.ieker.ierp.bsb.action.front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
import com.ieker.ierp.core.web.util.URLHelper;
@Controller
public class BsbIndexAct {
	@RequestMapping(value = "/bsb/index.jspx", method = RequestMethod.GET)
	public String index(HttpServletRequest request,HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user=CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if(null==user)
			return "login";
		return "/bsb/bsb_index";
	}
	@RequestMapping(value = "/bsb/settings/guide.jspx", method = RequestMethod.GET)
	public String initAccount(HttpServletRequest request,HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/settings/guide/default");
	}
	@RequestMapping(value = "/bsb/default-new.jspx")
	public String printTemplates(String storageNo,  String storageName,String depict,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/settings/guide/default_new");
	}

	
}
