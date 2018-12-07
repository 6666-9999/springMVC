package com.cssl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cssl.vo.UsersVo;

@Controller
@SessionAttributes(types=UsersVo.class,names="usersVo")
public class NotoController {

	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam(defaultValue="0",required=false) int id,ModelAndView mav) {
		System.out.println("id:"+id);
		mav.setViewName("sessnc");
		mav.addObject("sb", id);
		return mav;
	}
	
	@RequestMapping("/login")
	public String login(UsersVo uv) {
		System.out.println("用户名："+uv.getName());
		if(uv.getName().equals("admin")) {
			return "sessnc";
		}
		return "index";
	}
	
	/**
	 *   返回对象、集合，返回值自动保存到Model
	 *  url自动作为视图名
	 * @param uvo
	 * @return
	 */
	@RequestMapping("/login1")
	public List<UsersVo> login1(){
		List<UsersVo> list=new ArrayList<>();
		list.add(new UsersVo("栏内","111"));
		list.add(new UsersVo("狗狗","111"));
		return list;
	}
}
