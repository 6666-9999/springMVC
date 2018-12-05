package com.cssl.dao;

import java.util.List;

import com.cssl.pojo.District;

public interface DistrictMapper {

	/**
	 * 查询所有区
	 * @return
	 */
	public List<District> getAll();
}
