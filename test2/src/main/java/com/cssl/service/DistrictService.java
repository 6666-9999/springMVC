package com.cssl.service;

import java.util.List;

import com.cssl.pojo.District;
import com.cssl.pojo.Street;

public interface DistrictService {

	/**
	 * 查询所有区
	 * @return
	 */
	public List<District> getAll();
	
	/**
	 * 根据区id查询街道
	 * @param did
	 * @return
	 */
	public List<Street> getStreetByDid(int did);
}
