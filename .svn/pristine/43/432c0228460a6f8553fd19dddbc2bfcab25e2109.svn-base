package cn.easymis.entitys.mybatis.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cn.easymis.entitys.mybatis.dto.base.BaseCmsUser;

public class OaUser extends BaseCmsUser {
	private java.util.Set<CmsUserSite> userSites;
	private java.util.Set<CmsRole> roles;
	private String staffId;
	private String staffName;
	private String staffWorkNo;
	private List<Function> menus;
	public java.util.Set<CmsUserSite> getUserSites() {
		return userSites;
	}

	public void forMember(UnifiedUser u) {
		forUser(u);
		setAdmin(false);
		setRank(0);
		setSelfAdmin(false);
	}

	public void forUser(UnifiedUser u) {
		setDisabled(false);
		setId(u.getId());
		setUsername(u.getUsername());
		setEmail(u.getEmail());
		setRegisterIp(u.getRegisterIp());
		setRegisterTime(u.getRegisterTime());
		setLastLoginIp(u.getLastLoginIp());
		setLastLoginTime(u.getLastLoginTime());
		setLoginCount(0);
	}

	public void setUserSites(java.util.Set<CmsUserSite> userSites) {
		this.userSites = userSites;
	}

	public String getStaffWorkNo() {
		return staffWorkNo;
	}

	public void setStaffWorkNo(String staffWorkNo) {
		this.staffWorkNo = staffWorkNo;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public java.util.Set<CmsRole> getRoles() {
		return roles;
	}

	public void setRoles(java.util.Set<CmsRole> roles) {
		this.roles = roles;
	}

	public Set<String> getPerms(String siteId, Set<String> perms) {
		if (getDisabled()) {
			return null;
		}
		Set<CmsUserSite> userSits = getUserSites();
		if (userSits == null) {
			return null;
		}
		Set<CmsRole> roles = getRoles();
		if (roles == null) {
			return null;
		}
		boolean hasSitePermission = false;
		for (CmsUserSite cus : userSits) {
			if (cus.getSite().getId().equals(siteId)) {
				hasSitePermission = true;
			}
		}
		if (!hasSitePermission) {
			return null;
		}
		boolean isSuper = false;
		Set<String> allPerms = new HashSet<String>();
		for (CmsRole role : getRoles()) {
			if (role.getAll()) {
				isSuper = true;
				break;
			}
			allPerms.addAll(role.getPerms());
		}
		if (isSuper) {
			allPerms.clear();
			allPerms.add("*");
		}
		return allPerms;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public List<Function> getMenus() {
		return menus;
	}

	public void setMenus(List<Function> menus) {
		this.menus = menus;
	}
	
}