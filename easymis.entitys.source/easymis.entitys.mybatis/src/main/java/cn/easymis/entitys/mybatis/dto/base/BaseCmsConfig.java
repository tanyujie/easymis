package cn.easymis.entitys.mybatis.dto.base;

import java.io.Serializable;

import cn.easymis.entitys.mybatis.dto.CmsConfigItem;
import cn.easymis.entitys.mybatis.dto.EmailConfig;
import cn.easymis.entitys.mybatis.dto.MarkConfig;


/**
 * This is an object that contains data related to the jc_config table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_config"
 */

public abstract class BaseCmsConfig  implements Serializable {
	// primary key
	private java.lang.Integer id;
	// fields
	private java.lang.String contextPath;
	private java.lang.String servletPoint;
	private java.lang.Integer port;
	private java.lang.String dbFileUri;
	private java.lang.Boolean uploadToDb;
	private java.lang.String defImg;
	private java.lang.String loginUrl;
	private java.lang.String processUrl;
	private java.util.Date countClearTime;
	private java.util.Date countCopyTime;
	private java.lang.String downloadCode;
	private java.lang.Integer downloadTime;
	private java.lang.Boolean emailValidate;
	private java.lang.Boolean viewOnlyChecked;
	
	// components
	 MarkConfig m_markConfig;
	 EmailConfig m_emailConfig;

	// collections
	private java.util.Map<java.lang.String, java.lang.String> attr;
	private java.util.Set<CmsConfigItem> registerItems;
	
	public MarkConfig getM_markConfig() {
		return m_markConfig;
	}
	public void setM_markConfig(MarkConfig m_markConfig) {
		this.m_markConfig = m_markConfig;
	}
	public EmailConfig getM_emailConfig() {
		return m_emailConfig;
	}
	public void setM_emailConfig(EmailConfig m_emailConfig) {
		this.m_emailConfig = m_emailConfig;
	}
	public java.util.Map<java.lang.String, java.lang.String> getAttr() {
		return attr;
	}
	public void setAttr(java.util.Map<java.lang.String, java.lang.String> attr) {
		this.attr = attr;
	}
	public java.util.Set<CmsConfigItem> getRegisterItems() {
		return registerItems;
	}
	public void setRegisterItems(java.util.Set<CmsConfigItem> registerItems) {
		this.registerItems = registerItems;
	}
	public java.lang.Integer getId() {
		return id;
	}
	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	public java.lang.String getContextPath() {
		return contextPath;
	}
	public void setContextPath(java.lang.String contextPath) {
		this.contextPath = contextPath;
	}
	public java.lang.String getServletPoint() {
		return servletPoint;
	}
	public void setServletPoint(java.lang.String servletPoint) {
		this.servletPoint = servletPoint;
	}
	public java.lang.Integer getPort() {
		return port;
	}
	public void setPort(java.lang.Integer port) {
		this.port = port;
	}
	public java.lang.String getDbFileUri() {
		return dbFileUri;
	}
	public void setDbFileUri(java.lang.String dbFileUri) {
		this.dbFileUri = dbFileUri;
	}
	public java.lang.Boolean getUploadToDb() {
		return uploadToDb;
	}
	public void setUploadToDb(java.lang.Boolean uploadToDb) {
		this.uploadToDb = uploadToDb;
	}
	public java.lang.String getDefImg() {
		return defImg;
	}
	public void setDefImg(java.lang.String defImg) {
		this.defImg = defImg;
	}
	public java.lang.String getLoginUrl() {
		return loginUrl;
	}
	public void setLoginUrl(java.lang.String loginUrl) {
		this.loginUrl = loginUrl;
	}
	public java.lang.String getProcessUrl() {
		return processUrl;
	}
	public void setProcessUrl(java.lang.String processUrl) {
		this.processUrl = processUrl;
	}
	public java.util.Date getCountClearTime() {
		return countClearTime;
	}
	public void setCountClearTime(java.util.Date countClearTime) {
		this.countClearTime = countClearTime;
	}
	public java.util.Date getCountCopyTime() {
		return countCopyTime;
	}
	public void setCountCopyTime(java.util.Date countCopyTime) {
		this.countCopyTime = countCopyTime;
	}
	public java.lang.String getDownloadCode() {
		return downloadCode;
	}
	public void setDownloadCode(java.lang.String downloadCode) {
		this.downloadCode = downloadCode;
	}
	public java.lang.Integer getDownloadTime() {
		return downloadTime;
	}
	public void setDownloadTime(java.lang.Integer downloadTime) {
		this.downloadTime = downloadTime;
	}
	public java.lang.Boolean getEmailValidate() {
		return emailValidate;
	}
	public void setEmailValidate(java.lang.Boolean emailValidate) {
		this.emailValidate = emailValidate;
	}
	public java.lang.Boolean getViewOnlyChecked() {
		return viewOnlyChecked;
	}
	public void setViewOnlyChecked(java.lang.Boolean viewOnlyChecked) {
		this.viewOnlyChecked = viewOnlyChecked;
	}


}