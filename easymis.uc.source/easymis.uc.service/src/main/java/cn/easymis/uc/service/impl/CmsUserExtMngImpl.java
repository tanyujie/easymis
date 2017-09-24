package cn.easymis.uc.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.easymis.entitys.mybatis.dto.CmsUserExt;
import cn.easymis.uc.service.CmsUserExtMng;
@Service
@Transactional
public class CmsUserExtMngImpl implements CmsUserExtMng {

	@Override
	public List<CmsUserExt> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CmsUserExt findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(CmsUserExt bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CmsUserExt bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
