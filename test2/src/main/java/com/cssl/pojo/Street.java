package com.cssl.pojo;

/**
 * 街道实体类
 * @author asua
 *
 */
public class Street {

	private Integer sid;
	private String sname;
	private District district;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

}
