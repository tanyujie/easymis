package cn.easymis.uc.service;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import com.easymis.commons.eamil.EmailSender;
import com.easymis.commons.eamil.MessageTemplate;

import cn.easymis.entitys.mybatis.dto.CmsSite;
import cn.easymis.entitys.mybatis.dto.OaUser;
import cn.easymis.entitys.mybatis.dto.CmsUserExt;

public interface CmsUserMng {
	public List getPage(String username, String email, Integer siteId,
			Integer groupId, Boolean disabled, Boolean admin, Integer rank,
			int pageNo, int pageSize);
	
	public List<OaUser> getList(String username, String email, Integer siteId,
			Integer groupId, Boolean disabled, Boolean admin, Integer rank);
	public List<OaUser> getPageBySiteIdsForTag(Integer[] siteIds,
			Integer[] verifyTypes, Boolean titleImg, Integer userType,
			String title,Map<String,String[]>attr,int orderBy, int pageNo, int pageSize);
	public List<OaUser> getListBySiteIdsForTag(Integer[] siteIds,
			Integer[] verifyTypes, Boolean titleImg, Integer userType,
			String title,Map<String,String[]>attr, int orderBy, Integer first, Integer count);

	public List<OaUser> getAdminList(String siteId, Boolean allChannel,
			Boolean disabled, Integer rank);
	
	public List<OaUser> getAdminsByDepartId(String id, int pageNo,int pageSize);
	
	public List<OaUser> getAdminsByRoleId(String roleId, int pageNo, int pageSize);

	public OaUser findById(String id);

	public OaUser findByUsername(String username);
	/**
	 * 保存注册信息
	 * @param orgName 组织结构名
	 * @param mobile 手机号码
	 * @param password 密码
	 * @param ip
	 */
	public void save(String orgName,String mobile, String password, String ip);
	/**
	 * 系统内部-新增用户
	 * @param orgId 组织机构
	 * @param userName 用户名
	 * @param staffName 真实姓名
	 * @param mobile 手机号码
	 * @param password 密码
	 * @param ip 注册ip
	 */
	public void save(String orgId,String userName,String staffName,String mobile, String password, String ip);
	public OaUser registerMember(String username, String email,String mobile,
			String password, String ip, Integer groupId,Integer grain, boolean disabled,CmsUserExt userExt,Map<String,String>attr);
	public OaUser registerMember(String username, String email,String mobile,
			String password, String ip, Integer groupId, boolean disabled,CmsUserExt userExt,Map<String,String>attr, Boolean activation , EmailSender sender, MessageTemplate msgTpl)throws UnsupportedEncodingException, MessagingException ;
	public void updateLoginInfo(String userId, String ip);

	public void updateUploadSize(String userId, Integer size);
	
	public void updateUser(OaUser user);

	public void updatePwdEmail(String id, String password, String email);

	public boolean isPasswordValid(String id, String password);

	public OaUser saveAdmin(String username, String email, String password,
			String ip, boolean viewOnly, boolean selfAdmin, int rank,
			Integer groupId, Integer[] roleIds, Integer[] channelIds,
			Integer[] siteIds, Byte[] steps, Boolean[] allChannels,
			CmsUserExt userExt);

	public OaUser updateAdmin(OaUser bean, CmsUserExt ext, String password,
			Integer groupId,Integer[] roleIds, Integer[] channelIds,
			Integer[] siteIds, Byte[] steps, Boolean[] allChannels);

	public OaUser updateAdmin(OaUser bean, CmsUserExt ext, String password,
			Integer groupId,Integer[] roleIds, Integer[] channelIds,
			Integer siteId, Byte step, Boolean allChannel);
	public OaUser updateMember(Integer id, String email, String password,
			Boolean isDisabled, CmsUserExt ext, Integer groupId,Integer grain,Map<String,String>attr);
	public OaUser updateMember(Integer id, CmsUserExt ext);
	public OaUser updateUserConllection(OaUser user,Integer cid,Integer operate);

	public void addSiteToUser(OaUser user, CmsSite site, Byte checkStep);

	public OaUser deleteById(Integer id);

	public OaUser[] deleteByIds(Integer[] ids);

	public boolean usernameNotExist(String username);
	
	public boolean usernameNotExistInMember(String username);

	public boolean emailNotExist(String email);

}