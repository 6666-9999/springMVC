package com.cssl.dao;

import org.apache.ibatis.annotations.Param;

import com.cssl.pojo.Users;

public interface UsersMapper {

	/**
	 * 注册
	 * @param users
	 * @return
	 */
	public int register(Users users);
	
	/**
	 * 登录
	 * @param users
	 * @return
	 */
	public Users login(Users users);
	
	/**
	 * 判断用户名是否存在
	 * @param name
	 * @return
	 */
	public int isExists(@Param("name") String name);
}
