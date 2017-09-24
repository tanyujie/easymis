package cn.easymis.oa.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.easymis.entitys.mybatis.mapper.OaAttendDutyMapper;
import cn.easymis.oa.service.OaAttendDutyMng;


@Service
public class OaAttendDutyMngImpl implements OaAttendDutyMng {
	@Autowired
	private OaAttendDutyMapper mapper;

	public List<cn.easymis.entitys.mybatis.dto.OaAttendDutyDto> getList(HashMap<String, Object> params) {
		return this.mapper.getList(params);
	}

	public void save(cn.easymis.entitys.mybatis.dto.OaAttendDutyDto bean) {
		this.mapper.save(bean);
	}

	public void update(cn.easymis.entitys.mybatis.dto.OaAttendDutyDto bean) {
		this.mapper.update(bean);
	}

	public void delete(String attendDutyId) {
		this.mapper.delete(attendDutyId);
	}

	public cn.easymis.entitys.mybatis.dto.OaAttendDutyDto findById(String attendDutyId) {
		return this.mapper.findById(attendDutyId);
	}
}
