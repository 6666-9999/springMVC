package com.cssl.service;

import java.util.Map;

import com.cssl.pojo.House;
import com.github.pagehelper.Page;

public interface HouseService {

	/**
	 * 发布房屋
	 * @param house
	 * @return
	 */
	public int issue(House house);
	
	/**
	 * 按条件分页查询
	 * @param map
	 * @return
	 */
	public Page<Object> getAllByLike(Map<String, Object> map);
	
	/**
	 * 查询一条房屋信息
	 * @param hid
	 * @return
	 */
	public House getByOne(int hid);
	
	/**
	 * 修改房屋信息
	 * @param house
	 * @return
	 */
	public int update(House house);
	
	/**
	 * 删除房屋信息
	 * @param hid
	 * @return
	 */
	public int del(int hid);
}
