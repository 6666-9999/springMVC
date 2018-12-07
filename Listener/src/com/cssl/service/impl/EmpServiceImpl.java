package com.cssl.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cssl.dao.EmpMapper;
import com.cssl.pojo.Emp;
import com.cssl.service.EmpService;
import com.cssl.util.MyUtil;

public class EmpServiceImpl implements EmpService {
	
	private EmpMapper em=null;

	@Override
	public List<Emp> getAll() {
		SqlSession session=MyUtil.getSession();
		em=session.getMapper(EmpMapper.class);
		return em.getAll();
	}

}
