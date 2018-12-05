package com.cssl.pojo;

import java.util.Set;

/**
 * 区实体类
 * 
 * @author asua
 *
 */
public class District {

	private Integer did;
	private String dname;
	private Set<Street> set;

	public Integer getDid() {
		return did;
	}

	public String getDname() {
		return dname;
	}

	public Set<Street> getSet() {
		return set;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setSet(Set<Street> set) {
		this.set = set;
	}

}
