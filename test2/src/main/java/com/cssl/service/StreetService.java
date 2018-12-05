package com.cssl.service;

import java.util.List;

import com.cssl.pojo.Street;

public interface StreetService {

	/**
	 * 查询所有街道
	 * @return
	 */
	public List<Street> getAll();
}
