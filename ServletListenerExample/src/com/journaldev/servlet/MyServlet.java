package com.journaldev.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext ctx = request.getServletContext();
		
		ctx.setAttribute("User", "Linux" +
				"");
		
		ctx.setAttribute("Kogeila", "Linux");
		
		ctx.setInitParameter("DBUSER", "perrin");
		
		ctx.setAttribute("User", "lino");
		
		String user = (String) ctx.getAttribute("User");
		ctx.removeAttribute("User");

		
		 String DBUser = (String) ctx.getInitParameter("DBUSER");
		 
		HttpSession session = request.getSession();
		session.invalidate();
		

		PrintWriter out = response.getWriter();
		out.write("<b>Hi Mr <b>" + user + " and mi dbuser is: " + DBUser);
	}

}
