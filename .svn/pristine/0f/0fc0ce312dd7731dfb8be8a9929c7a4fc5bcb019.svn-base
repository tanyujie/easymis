package cn.easymis.entitys.mybatis.mapper;

import java.util.List;
import java.util.Map;

import cn.easymis.entitys.mybatis.dto.OaUser;

/**
 * 用户DAO接口
 */
public interface OaUserMapper{
	public List<OaUser> getPage(String username, String email, Integer siteId,
			Integer groupId, Boolean disabled, Boolean admin, Integer rank,
			int pageNo, int pageSize);
	
	public List<OaUser> getList(String username, String email, Integer siteId,
			Integer groupId, Boolean disabled, Boolean admin, Integer rank);
	public List<OaUser> getPageBySiteIdsForTag(Integer[] siteIds,
			Integer[] typeIds, Boolean titleImg, Integer userType,
			String title, Map<String,String[]>attr,int orderBy, int pageNo, int pageSize);

	public List<OaUser> getListBySiteIdsForTag(Integer[] siteIds,
			Integer[] typeIds, Boolean titleImg, Integer userType,
			String title,Map<String,String[]>attr, int orderBy, Integer first, Integer count);
	public List<OaUser> getAdminList(Integer siteId, Boolean allChannel,
			Boolean disabled, Integer rank);
	
	public List<OaUser> getAdminsByDepartId(Integer id, int pageNo,int pageSize);
	
	public List<OaUser> getAdminsByRoleId(Integer roleId, int pageNo, int pageSize);

	public OaUser findById(String id);

	public OaUser findByUsername(String username);

	public int countByUsername(String username);
	
	public int countMemberByUsername(String username);

	public int countByEmail(String email);

	public void save(OaUser bean);

	public OaUser update(OaUser bean);

	public OaUser deleteById(Integer id);
}