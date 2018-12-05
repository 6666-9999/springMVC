package com.cssl.pojo;

import java.sql.Date;

/**
 * 房屋信息实体类
 * @author asua
 *
 */
public class House {

	private Integer hid;
	private Integer usid;
	private Integer sid;
	private Integer tid;
	private Integer price;
	private String title;
	private String content;
	private Date htime;
	private Integer area;
	private String phone;
	
	private Users users;
	private District dis;
	private Street st;
	private Type tp;

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public District getDis() {
		return dis;
	}

	public void setDis(District dis) {
		this.dis = dis;
	}

	public Street getSt() {
		return st;
	}

	public void setSt(Street st) {
		this.st = st;
	}

	public Type getTp() {
		return tp;
	}

	public void setTp(Type tp) {
		this.tp = tp;
	}

	public Integer getHid() {
		return hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public Integer getUsid() {
		return usid;
	}

	public void setUsid(Integer usid) {
		this.usid = usid;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getHtime() {
		return htime;
	}

	public void setHtime(Date htime) {
		this.htime = htime;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "House [hid=" + hid + ", usid=" + usid + ", sid=" + sid + ", tid=" + tid + ", price=" + price
				+ ", title=" + title + ", content=" + content + ", htime=" + htime + ", area=" + area + ", phone="
				+ phone + ", users=" + users + ", dis=" + dis + ", st=" + st + ", tp=" + tp + "]";
	}

	
}
