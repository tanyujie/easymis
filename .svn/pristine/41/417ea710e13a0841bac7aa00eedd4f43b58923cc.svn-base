package cn.easymis.hrm.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.easymis.entitys.mybatis.mapper.HrmResumeMapper;
import cn.easymis.hrm.service.HrmResumeMng;

@Service
public class HrmResumeMngImpl implements HrmResumeMng {
	@Autowired
	private HrmResumeMapper mapper;

	public List<cn.easymis.entitys.mybatis.dto.HrmResumeDto> getList(HashMap<String, Object> params) {
		return this.mapper.getList(params);
	}

	public void save(cn.easymis.entitys.mybatis.dto.HrmResumeDto bean) {
		this.mapper.save(bean);
	}

	public void update(cn.easymis.entitys.mybatis.dto.HrmResumeDto bean) {
		this.mapper.update(bean);
	}

	public void delete(String resumeId) {
		this.mapper.delete(resumeId);
	}

	public cn.easymis.entitys.mybatis.dto.HrmResumeDto findById(String resumeId) {
		return this.mapper.findById(resumeId);
	}
}
