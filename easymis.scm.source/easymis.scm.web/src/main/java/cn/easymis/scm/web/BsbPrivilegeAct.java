package com.ieker.ierp.bsb.action.front;

import java.util.List;

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
import com.ieker.ierp.hr.entity.HrStaffInfo;
import com.ieker.ierp.hr.manager.HrStaffInfoMng;

/**
 * 
 * @author lenovo-t
 *
 */
@Controller
public class BsbPrivilegeAct {
	/**
	 * @see 权限设置
	 * @param storageNo
	 * @param storageName
	 * @param depict
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/bsb/settings/authority.jspx")
	public String authority(String storageNo,  String storageName,String depict,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		Organize organize = organizeMng.findByIdOnInfo(user.getOrgId());
		HrStaffInfo staff = new HrStaffInfo();
		staff.setOrgId(user.getOrgId());
		List<HrStaffInfo> staffList =staffInfoMng.getList(staff);
		model.put("organize", organize);
		model.put("staffList", staffList);

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/settings/authority/authority_index");
	}
	@RequestMapping(value = "/bsb/settings/operationLog.jspx")
	public String operationLog(String storageNo,  String storageName,String depict,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/settings/system/operation_log_list");
	}
	@RequestMapping(value = "/bsb/settings/privilege/createStaff.jspx")
	public String createStaff(String storageNo,  String storageName,String depict,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/settings/authority/create_staff");
	}
	@RequestMapping(value = "/bsb/settings/privilege/alloc.jspx")
	public String alloc(String storageNo,  String storageName,String depict,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/settings/authority/alloc");
	}
	@Autowired
	private OrganizeMng organizeMng;
	@Autowired
	HrStaffInfoMng staffInfoMng;
}
