package cn.easymis.entitys.mybatis.mapper;import java.util.List;import java.util.HashMap;import org.apache.ibatis.annotations.Param;import cn.easymis.entitys.mybatis.dto.SysFunctionDto;public interface SysFunctionMapper {public List<cn.easymis.entitys.mybatis.dto.SysFunctionDto> getList(@Param("map")HashMap<String, Object> params);public void save(cn.easymis.entitys.mybatis.dto.SysFunctionDto pojo);public void update(cn.easymis.entitys.mybatis.dto.SysFunctionDto pojo);public void delete(String functionId);public cn.easymis.entitys.mybatis.dto.SysFunctionDto findById(String functionId);}