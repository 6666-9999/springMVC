package com.cssl.dao;

import java.util.List;

import com.cssl.pojo.Street;

public interface StreetMapper {

	/**
	 * 查询所有街道
	 * @return
	 */
	public List<Street> getAll();
}
