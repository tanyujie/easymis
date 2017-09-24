package cn.easymis.entitys.mybatis.dto;

import org.apache.commons.lang.StringUtils;

import cn.easymis.entitys.mybatis.dto.base.BaseCmsConfig;

public class CmsConfig extends BaseCmsConfig {
	private static final long serialVersionUID = 1L;
	public static final String VERSION = "version";

	public String getVersion() {
		return getAttr().get(VERSION);
	}
	
	
	public MemberConfig getMemberConfig() {
		MemberConfig memberConfig = new MemberConfig(getAttr());
		return memberConfig;
	}

	public void setMemberConfig(MemberConfig memberConfig) {
		getAttr().putAll(memberConfig.getAttr());
	}
	
	public CmsConfigAttr getConfigAttr() {
		CmsConfigAttr configAttr = new CmsConfigAttr(getAttr());
		return configAttr;
	}

	public void setConfigAttr(CmsConfigAttr configAttr) {
		getAttr().putAll(configAttr.getAttr());
	}
	
	public Boolean getQqEnable(){
		CmsConfigAttr configAttr=getConfigAttr();
		return configAttr.getQqEnable();
	}
	
	public Boolean getSinaEnable(){
		CmsConfigAttr configAttr=getConfigAttr();
		return configAttr.getSinaEnable();
	}
	
	public Boolean getQqWeboEnable(){
		CmsConfigAttr configAttr=getConfigAttr();
		return configAttr.getQqWeboEnable();
	}
	
	public String getQqID(){
		CmsConfigAttr configAttr=getConfigAttr();
		return configAttr.getQqID();
	}
	
	public String getSinaID(){
		CmsConfigAttr configAttr=getConfigAttr();
		return configAttr.getSinaID();
	}
	
	public String getQqWeboID(){
		CmsConfigAttr configAttr=getConfigAttr();
		return configAttr.getQqWeboID();
	}
	
	public Boolean getWeixinEnable(){
		CmsConfigAttr configAttr=getConfigAttr();
		return configAttr.getWeixinEnable();
	}
	
	public String getWeixinID(){
		CmsConfigAttr configAttr=getConfigAttr();
		return configAttr.getWeixinID();
	}
	
	public String getWeixinKey(){
		CmsConfigAttr configAttr=getConfigAttr();
		return configAttr.getWeixinKey();
	}

	public void blankToNull() {
		// oracle varchar2把空串当作null处理，这里为了统一这个特征，特做此处理。
		if (StringUtils.isBlank(getProcessUrl())) {
			setProcessUrl(null);
		}
		if (StringUtils.isBlank(getContextPath())) {
			setContextPath(null);
		}
		if (StringUtils.isBlank(getServletPoint())) {
			setServletPoint(null);
		}
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsConfig() {
		super();
	}


	

}