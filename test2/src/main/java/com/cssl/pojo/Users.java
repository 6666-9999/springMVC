package com.cssl.pojo;

/**
 * 用户实体类
 * @author asua
 *
 */
public class Users {

	private Integer usid;
	private String username;
	private String password;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUsid() {
		return usid;
	}

	public void setUsid(Integer usid) {
		this.usid = usid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Users(Integer usid, String username, String password, String name) {
		super();
		this.usid = usid;
		this.username = username;
		this.password = password;
		this.name = name;
	}

	public Users(Integer usid, String username, String password) {
		super();
		this.usid = usid;
		this.username = username;
		this.password = password;
	}

	public Users() {
		super();
	}

}
