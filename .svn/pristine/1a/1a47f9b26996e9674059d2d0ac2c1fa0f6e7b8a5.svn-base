package com.easymis.crm.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easymis.crm.service.CrmVisitMng;

import cn.easymis.entitys.mybatis.mapper.CrmVisitMapper;

@Service
public class CrmVisitMngImpl implements CrmVisitMng {
	@Autowired
	private CrmVisitMapper mapper;

	public List<cn.easymis.entitys.mybatis.dto.CrmVisitDto> getList(HashMap<String, Object> params) {
		return this.mapper.getList(params);
	}

	public void save(cn.easymis.entitys.mybatis.dto.CrmVisitDto bean) {
		this.mapper.save(bean);
	}

	public void update(cn.easymis.entitys.mybatis.dto.CrmVisitDto bean) {
		this.mapper.update(bean);
	}

	public void delete(String visitId) {
		this.mapper.delete(visitId);
	}

	public cn.easymis.entitys.mybatis.dto.CrmVisitDto findById(String visitId) {
		return this.mapper.findById(visitId);
	}
}
