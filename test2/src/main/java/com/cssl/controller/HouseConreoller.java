package com.cssl.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cssl.pojo.House;
import com.cssl.pojo.Users;
import com.cssl.service.HouseService;
import com.github.pagehelper.Page;

@Controller
public class HouseConreoller {
	@Autowired
	private HouseService hs;

	/**
	 * 加载房屋信息页面
	 * 
	 * @param map
	 * @param mav
	 * @return
	 */
	@RequestMapping("/load")
	public ModelAndView load2(@RequestParam Map<String, Object> map, ModelAndView mav, HttpSession session) {
		Users users = (Users) session.getAttribute("users");
		int usid = 0;
		if (users != null) {
			usid = users.getUsid();
		}	
		map.put("usid", usid);
		Page<Object> page = hs.getAllByLike(map);
		mav.setViewName("house");
		mav.addObject("pg", page);
		return mav;
	}

	/**
	 * 发布一条房屋信息
	 * 
	 * @param house
	 * @param session
	 * @return
	 */
	@RequestMapping("/add")
	public String add(House house, HttpSession session) {
		Users users = (Users) session.getAttribute("users");
		house.setUsid(users.getUsid());
		int row = hs.issue(house);
		if (row > 0) {
			return "forward:/load.action";
		} else {
			return "addHouse";
		}
	}

	/**
	 * 判断是否登录， 如果登录就跳到发布房屋页面
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/issus")
	public String issus(Model mo, HttpSession session) {
		Users users = (Users) session.getAttribute("users");
		if (users == null) {
			return "login";
		} else {
			return "addHouse";
		}
	}

	/**
	 * 查询一条房屋信息
	 * 
	 * @param hid
	 * @return
	 */
	@RequestMapping("/details")
	public House getOne(int hid) {
		House house = hs.getByOne(hid);
		return house;
	}

	/**
	 * 跳到修改页面
	 * 
	 * @param hid
	 * @return
	 */
	@RequestMapping("/updateHouse")
	public House getUpdate(int hid) {
		House house = hs.getByOne(hid);
		return house;
	}

	/**
	 * 修改房屋信息
	 * 
	 * @param house
	 * @return
	 */
	@RequestMapping("/update")
	public String upd(House house) {
		int row = hs.update(house);
		if (row > 0) {
			return "forward:/load.action";
		} else {
			return "forward:/updateHouse?hid=" + house.getHid();
		}
	}

	/**
	 * 删除一条房屋信息
	 * 
	 * @param hid
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/del")
	public void del(int hid, HttpServletResponse response) throws IOException {
		int row = hs.del(hid);
		OutputStream out = response.getOutputStream();
		if (row > 0) {
			out.write("Y".getBytes());
		} else {
			out.write("N".getBytes());
		}
		out.flush();
		out.close();
	}
}
