package com.cssl.vo;

public class UsersVo {

	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UsersVo(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public UsersVo() {
		super();
	}

}
