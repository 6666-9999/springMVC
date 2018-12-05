package com.cssl.service;

import java.util.List;

import com.cssl.pojo.Type;

public interface TypeService {

	/**
	 * 查询所有房屋类型
	 * @return
	 */
	public List<Type> getAll();
}
