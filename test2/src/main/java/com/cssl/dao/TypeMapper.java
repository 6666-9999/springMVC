package com.cssl.dao;

import java.util.List;

import com.cssl.pojo.Type;

public interface TypeMapper {

	/**
	 * 查询所有房屋类型
	 * @return
	 */
	public List<Type> getAll();
}
