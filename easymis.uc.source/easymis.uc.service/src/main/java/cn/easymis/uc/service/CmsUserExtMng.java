package cn.easymis.uc.service;

import java.util.List;

import cn.easymis.entitys.mybatis.dto.CmsUserExt;

public interface CmsUserExtMng {
	public List<CmsUserExt> getList();

	public CmsUserExt findById(String id);

	public void save(CmsUserExt bean);

	public void update(CmsUserExt bean);

	public void deleteById(Integer id);
}
