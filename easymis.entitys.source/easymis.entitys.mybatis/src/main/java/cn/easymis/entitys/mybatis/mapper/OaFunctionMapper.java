package cn.easymis.entitys.mybatis.mapper;import java.util.List;import java.util.HashMap;import org.apache.ibatis.annotations.Param;import cn.easymis.entitys.mybatis.dto.OaFunctionDto;public interface OaFunctionMapper {public List<cn.easymis.entitys.mybatis.dto.OaFunctionDto> getList(@Param("map")HashMap<String, Object> params);public void save(cn.easymis.entitys.mybatis.dto.OaFunctionDto pojo);public void update(cn.easymis.entitys.mybatis.dto.OaFunctionDto pojo);public void delete(String functionId);public cn.easymis.entitys.mybatis.dto.OaFunctionDto findById(String functionId);}