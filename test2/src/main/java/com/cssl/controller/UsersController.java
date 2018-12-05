package com.cssl.controller;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cssl.pojo.Users;
import com.cssl.service.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	private UsersService us;

	@RequestMapping("/login")
	public String login(Users users,HttpSession session) {
		Users ue=us.login(users);
		if(ue==null) {
			return "login";
		}else {
			session.setAttribute("users", ue);
			return "forward:/load.action";
		}
	}
	
	@RequestMapping("/register")
	public String register(Users users) {
		int row=us.register(users);
		if(row>0) {
			return "login";
		}else {
			return "register";
		}
	}
	
	@RequestMapping("/exists")
	public void exists(String username,HttpServletResponse response) throws IOException {
		int row = us.isExists(username);
		OutputStream out = response.getOutputStream();
		if (row > 0) {
			out.write("N".getBytes());
		} else {
			out.write("Y".getBytes());
		}
		out.flush();
		out.close();
	}
	
	@RequestMapping("/exit")
	public String exit(HttpSession session) {
		session.removeAttribute("users");
		return "redirect:/login.jsp";
	}
}
