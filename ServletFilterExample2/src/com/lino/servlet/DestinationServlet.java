package com.lino.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DestinationServlet extends HttpServlet{
	
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws ServletException,IOException{
		
		System.out.println("destinationServlet");
		
		String filterParam = (String) req.getAttribute("filterAdded");
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/dest/hola.jsp");
		res.setContentType("text/html");
		res.getWriter().println("<font color=red>filter value is " + filterParam +"</font>");
		rd.include(req, res);
	}

}
