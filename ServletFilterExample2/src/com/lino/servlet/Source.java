package com.lino.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Source extends HttpServlet {
	
	
public void service(HttpServletRequest req , HttpServletResponse res) throws ServletException,IOException{
		
		System.out.println("Servlet source");
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/dest/Destination");
		rd.forward(req, res);
	}


}
