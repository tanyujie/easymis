package cn.easymis.entitys.mybatis.mapper;import java.util.List;import java.util.HashMap;import org.apache.ibatis.annotations.Param;import cn.easymis.entitys.mybatis.dto.OaAttendDutyDto;public interface OaAttendDutyMapper {public List<cn.easymis.entitys.mybatis.dto.OaAttendDutyDto> getList(@Param("map")HashMap<String, Object> params);public void save(cn.easymis.entitys.mybatis.dto.OaAttendDutyDto pojo);public void update(cn.easymis.entitys.mybatis.dto.OaAttendDutyDto pojo);public void delete(String attendDutyId);public cn.easymis.entitys.mybatis.dto.OaAttendDutyDto findById(String attendDutyId);}