package com.cssl.lisnener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.cssl.pojo.Emp;
import com.cssl.service.EmpService;
import com.cssl.service.impl.EmpServiceImpl;

public class ApplicationLisnener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ApplicationLisnener已销毁。。。。。");

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ApplicationLisnener已初始化。。。。。");
		EmpService es=new EmpServiceImpl();
		List<Emp> list=es.getAll();
		ServletContext application = arg0.getServletContext();
		application.setAttribute("list", list);
	}

}
