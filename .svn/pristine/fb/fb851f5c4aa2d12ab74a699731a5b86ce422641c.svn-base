package cn.easymis.finance.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.easymis.entitys.mybatis.mapper.FinanceCurrencyMapper;
import cn.easymis.finance.service.FinanceCurrencyMng;

@Service
public class FinanceCurrencyMngImpl implements FinanceCurrencyMng {
	@Autowired
	private FinanceCurrencyMapper mapper;

	public List<cn.easymis.entitys.mybatis.dto.FinanceCurrencyDto> getList(HashMap<String, Object> params) {
		return this.mapper.getList(params);
	}

	public void save(cn.easymis.entitys.mybatis.dto.FinanceCurrencyDto bean) {
		this.mapper.save(bean);
	}

	public void update(cn.easymis.entitys.mybatis.dto.FinanceCurrencyDto bean) {
		this.mapper.update(bean);
	}

	public void delete(String currencyId) {
		this.mapper.delete(currencyId);
	}

	public cn.easymis.entitys.mybatis.dto.FinanceCurrencyDto findById(String currencyId) {
		return this.mapper.findById(currencyId);
	}
}
