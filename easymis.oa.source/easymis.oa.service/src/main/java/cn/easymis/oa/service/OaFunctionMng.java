package cn.easymis.oa.service;

import java.util.List;

import cn.easymis.entitys.mybatis.dto.OaFunctionDto;

public interface OaFunctionMng {
	public void save(OaFunctionDto bean);
	public void update(OaFunctionDto bean);
	public void deleteById(String id);
	public OaFunctionDto findById(String id);
	public List<OaFunctionDto> getList(OaFunctionDto bean);
	public List<OaFunctionDto> getListOnStaff(OaFunctionDto bean);	
}
