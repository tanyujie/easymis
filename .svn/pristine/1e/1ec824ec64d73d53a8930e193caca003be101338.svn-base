package cn.easymis.entitys.mybatis.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.easymis.entitys.mybatis.dto.CrmBusinessDto;

public interface CrmBusinessMapper {
	public List<CrmBusinessDto> getList(@Param("map") HashMap<String, Object> params);

	public void save(CrmBusinessDto pojo);

	public void update(CrmBusinessDto pojo);

	public void delete(String businessId);

	public CrmBusinessDto findById(String businessId);
}