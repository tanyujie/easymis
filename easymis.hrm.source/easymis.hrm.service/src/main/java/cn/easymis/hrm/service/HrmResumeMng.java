package cn.easymis.hrm.service;

import java.util.HashMap;
import java.util.List;

public interface HrmResumeMng {
	public List<cn.easymis.entitys.mybatis.dto.HrmResumeDto> getList(HashMap<String, Object> params);

	public void save(cn.easymis.entitys.mybatis.dto.HrmResumeDto pojo);

	public void update(cn.easymis.entitys.mybatis.dto.HrmResumeDto pojo);

	public void delete(String resumeId);

	public cn.easymis.entitys.mybatis.dto.HrmResumeDto findById(String resumeId);
}