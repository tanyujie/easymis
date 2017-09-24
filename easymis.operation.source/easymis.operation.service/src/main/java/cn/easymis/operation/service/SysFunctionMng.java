package cn.easymis.operation.service;

import java.util.List;

import cn.easymis.entitys.mybatis.dto.SysFunctionDto;

public interface SysFunctionMng {
	public void save(SysFunctionDto bean);
	public void update(SysFunctionDto bean);
	public void deleteById(String id);
	public SysFunctionDto findById(String id);
	public List<SysFunctionDto> getList(SysFunctionDto bean);
}
