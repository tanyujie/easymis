package cn.easymis.project.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.easymis.entitys.mybatis.mapper.ProjectMapper;
import cn.easymis.project.service.ProjectMng;

@Service
public class ProjectMngImpl implements ProjectMng {
	@Autowired
	private ProjectMapper mapper;

	public List<cn.easymis.entitys.mybatis.dto.ProjectDto> getList(HashMap<String, Object> params) {
		return this.mapper.getList(params);
	}

	public void save(cn.easymis.entitys.mybatis.dto.ProjectDto bean) {
		this.mapper.save(bean);
	}

	public void update(cn.easymis.entitys.mybatis.dto.ProjectDto bean) {
		this.mapper.update(bean);
	}

	public void delete(String projectId) {
		this.mapper.delete(projectId);
	}

	public cn.easymis.entitys.mybatis.dto.ProjectDto findById(String projectId) {
		return this.mapper.findById(projectId);
	}
}
