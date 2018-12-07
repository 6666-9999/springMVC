package com.cssl.servlet;

import java.io.IOException;

//import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

@WebServlet("/SessionListenerServlet")
public class SessionListenerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpSession session = request.getSession();
		/*session.setAttribute("aaa", "aa");
		
		session.invalidate();*/
		
		/*session.setAttribute("妖怪", "林瑶");
		session.setAttribute("妖怪", "林妖怪");
		session.removeAttribute("妖怪");*/
		
		/*ServletContext application = request.getServletContext();
		application.setAttribute("lin", "林瑶");
		application.setAttribute("lin", "林妖怪");
		application.removeAttribute("lin");*/
		
		request.setAttribute("lin", "林瑶");
		request.setAttribute("lin", "林妖怪");
		request.removeAttribute("lin");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
