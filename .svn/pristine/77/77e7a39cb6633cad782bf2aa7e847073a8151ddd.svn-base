package com.easymis.crm.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easymis.crm.service.CrmBusinessMng;

import cn.easymis.entitys.mybatis.mapper.CrmBusinessMapper;

@Service
public class CrmBusinessMngImpl implements CrmBusinessMng {
	@Autowired
	private CrmBusinessMapper mapper;

	public List<cn.easymis.entitys.mybatis.dto.CrmBusinessDto> getList(HashMap<String, Object> params) {
		return this.mapper.getList(params);
	}

	public void save(cn.easymis.entitys.mybatis.dto.CrmBusinessDto bean) {
		this.mapper.save(bean);
	}

	public void update(cn.easymis.entitys.mybatis.dto.CrmBusinessDto bean) {
		this.mapper.update(bean);
	}

	public void delete(String businessId) {
		this.mapper.delete(businessId);
	}

	public cn.easymis.entitys.mybatis.dto.CrmBusinessDto findById(String businessId) {
		return this.mapper.findById(businessId);
	}
}
