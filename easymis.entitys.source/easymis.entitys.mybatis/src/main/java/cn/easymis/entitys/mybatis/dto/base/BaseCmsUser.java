package cn.easymis.entitys.mybatis.dto.base;

public class BaseCmsUser {
	// primary key
	private java.lang.String id;

	// fields
	private java.lang.String username;
	private String orgId;
	private Integer groupId;
	private java.lang.String name;
	private java.lang.String email;
	private java.util.Date registerTime;
	private java.lang.String registerIp;
	private java.util.Date lastLoginTime;
	private java.lang.String lastLoginIp;
	private java.lang.Integer loginCount;
	private java.lang.Integer rank;
	private java.lang.Long uploadTotal;
	private java.lang.Integer uploadSize;
	private java.sql.Date uploadDate;
	private java.lang.Boolean admin;
	private java.lang.Boolean selfAdmin;
	private java.lang.Boolean disabled;
	private java.lang.Integer userType;
	private java.lang.Integer verifyType;
	private java.lang.String avatar;
	private java.lang.String logo;

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}


	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getUsername() {
		return username;
	}

	public void setUsername(java.lang.String username) {
		this.username = username;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getEmail() {
		return email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.util.Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(java.util.Date registerTime) {
		this.registerTime = registerTime;
	}

	public java.lang.String getRegisterIp() {
		return registerIp;
	}

	public void setRegisterIp(java.lang.String registerIp) {
		this.registerIp = registerIp;
	}

	public java.util.Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(java.util.Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public java.lang.String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(java.lang.String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public java.lang.Integer getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(java.lang.Integer loginCount) {
		this.loginCount = loginCount;
	}

	public java.lang.Integer getRank() {
		return rank;
	}

	public void setRank(java.lang.Integer rank) {
		this.rank = rank;
	}

	public java.lang.Long getUploadTotal() {
		return uploadTotal;
	}

	public void setUploadTotal(java.lang.Long uploadTotal) {
		this.uploadTotal = uploadTotal;
	}

	public java.lang.Integer getUploadSize() {
		return uploadSize;
	}

	public void setUploadSize(java.lang.Integer uploadSize) {
		this.uploadSize = uploadSize;
	}

	public java.sql.Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(java.sql.Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public java.lang.Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(java.lang.Boolean admin) {
		this.admin = admin;
	}

	public java.lang.Boolean getSelfAdmin() {
		return selfAdmin;
	}

	public void setSelfAdmin(java.lang.Boolean selfAdmin) {
		this.selfAdmin = selfAdmin;
	}

	public java.lang.Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(java.lang.Boolean disabled) {
		this.disabled = disabled;
	}

	public java.lang.Integer getUserType() {
		return userType;
	}

	public void setUserType(java.lang.Integer userType) {
		this.userType = userType;
	}

	public java.lang.Integer getVerifyType() {
		return verifyType;
	}

	public void setVerifyType(java.lang.Integer verifyType) {
		this.verifyType = verifyType;
	}

	public java.lang.String getAvatar() {
		return avatar;
	}

	public void setAvatar(java.lang.String avatar) {
		this.avatar = avatar;
	}

	public java.lang.String getLogo() {
		return logo;
	}

	public void setLogo(java.lang.String logo) {
		this.logo = logo;
	}

}
