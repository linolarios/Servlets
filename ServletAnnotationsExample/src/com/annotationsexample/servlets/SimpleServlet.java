package com.annotationsexample.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.ServletSecurity.EmptyRoleSemantic;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Simple Servlet", description = "This is a simple servlet with annotations", urlPatterns = "/getServlet")
@ServletSecurity(
		 httpMethodConstraints = {
		  @HttpMethodConstraint(value = "POST", emptyRoleSemantic = EmptyRoleSemantic.DENY)
		
		 }
		)
//@ServletSecurity(value=@HttpConstraint)
public class SimpleServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("get request");
		response.sendRedirect("register.jsp");

	}
	
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Name " + request.getParameter("name"));
		System.out.println("Gender " + request.getParameter("gender"));
		System.out.println("Email " + request.getParameter("email"));
		System.out.println("Phone " + request.getParameter("phone"));
		System.out.println("City " + request.getParameter("city"));
		
		RequestDispatcher rd = request.getRequestDispatcher("details.jsp");
		
		
		rd.forward(request, response);
		

	}
	

}
