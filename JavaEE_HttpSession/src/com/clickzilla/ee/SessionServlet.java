package com.clickzilla.ee;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(description = "this servlet is about httpSession", urlPatterns = { "/SessionServlet" })
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
		try {
			String name = request.getParameter("name");
			HttpSession ses = request.getSession();
			if(name != "" && name != null){
				ses.setAttribute("name", name);
				response.sendRedirect("account.jsp");
			}else{
				response.sendRedirect("index.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
