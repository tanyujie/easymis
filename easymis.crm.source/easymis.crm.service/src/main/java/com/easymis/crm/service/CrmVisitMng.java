package com.easymis.crm.service;

import java.util.HashMap;
import java.util.List;

import cn.easymis.entitys.mybatis.dto.CrmVisitDto;

public interface CrmVisitMng {
	public List<CrmVisitDto> getList(HashMap<String, Object> params);

	public void save(CrmVisitDto pojo);

	public void update(CrmVisitDto pojo);

	public void delete(String visitId);

	public CrmVisitDto findById(String visitId);
}