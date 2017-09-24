package cn.easymis.uc.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.easymis.commons.eamil.EmailSender;
import com.easymis.commons.eamil.MessageTemplate;
import com.ieker.ierp.main.entity.Function;

import cn.easymis.entitys.mybatis.dto.CmsSite;
import cn.easymis.entitys.mybatis.dto.OaUser;
import cn.easymis.entitys.mybatis.dto.CmsUserExt;
import cn.easymis.uc.service.CmsUserMng;

@Service
@Transactional
public class CmsUserMngImpl implements CmsUserMng {

	@Override
	public List getPage(String username, String email, Integer siteId, Integer groupId, Boolean disabled, Boolean admin,
			Integer rank, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OaUser> getList(String username, String email, Integer siteId, Integer groupId, Boolean disabled,
			Boolean admin, Integer rank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OaUser> getPageBySiteIdsForTag(Integer[] siteIds, Integer[] verifyTypes, Boolean titleImg,
			Integer userType, String title, Map<String, String[]> attr, int orderBy, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OaUser> getListBySiteIdsForTag(Integer[] siteIds, Integer[] verifyTypes, Boolean titleImg,
			Integer userType, String title, Map<String, String[]> attr, int orderBy, Integer first, Integer count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OaUser> getAdminList(String siteId, Boolean allChannel, Boolean disabled, Integer rank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OaUser> getAdminsByDepartId(String id, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OaUser> getAdminsByRoleId(String roleId, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OaUser findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OaUser findByUsername(String username) {
		OaUser entity = userMapper.findByUsername(username);
		List<OaFunctionDto> menus = functionMng.getListOnStaff(new Function(entity.getStaffId()));
		entity.setMenus(menus);
		return entity;
	}

	@Override
	public void save(String orgName, String mobile, String password, String ip) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(String orgId, String userName, String staffName, String mobile, String password, String ip) {
		// TODO Auto-generated method stub

	}

	@Override
	public OaUser registerMember(String username, String email, String mobile, String password, String ip,
			Integer groupId, Integer grain, boolean disabled, CmsUserExt userExt, Map<String, String> attr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OaUser registerMember(String username, String email, String mobile, String password, String ip,
			Integer groupId, boolean disabled, CmsUserExt userExt, Map<String, String> attr, Boolean activation,
			EmailSender sender, MessageTemplate msgTpl) throws UnsupportedEncodingException, MessagingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateLoginInfo(String userId, String ip) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUploadSize(String userId, Integer size) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(OaUser user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePwdEmail(String id, String password, String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPasswordValid(String id, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OaUser saveAdmin(String username, String email, String password, String ip, boolean viewOnly,
			boolean selfAdmin, int rank, Integer groupId, Integer[] roleIds, Integer[] channelIds, Integer[] siteIds,
			Byte[] steps, Boolean[] allChannels, CmsUserExt userExt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OaUser updateAdmin(OaUser bean, CmsUserExt ext, String password, Integer groupId, Integer[] roleIds,
			Integer[] channelIds, Integer[] siteIds, Byte[] steps, Boolean[] allChannels) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OaUser updateAdmin(OaUser bean, CmsUserExt ext, String password, Integer groupId, Integer[] roleIds,
			Integer[] channelIds, Integer siteId, Byte step, Boolean allChannel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OaUser updateMember(Integer id, String email, String password, Boolean isDisabled, CmsUserExt ext,
			Integer groupId, Integer grain, Map<String, String> attr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OaUser updateMember(Integer id, CmsUserExt ext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OaUser updateUserConllection(OaUser user, Integer cid, Integer operate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSiteToUser(OaUser user, CmsSite site, Byte checkStep) {
		// TODO Auto-generated method stub

	}

	@Override
	public OaUser deleteById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OaUser[] deleteByIds(Integer[] ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean usernameNotExist(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean usernameNotExistInMember(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean emailNotExist(String email) {
		// TODO Auto-generated method stub
		return false;
	}
}
