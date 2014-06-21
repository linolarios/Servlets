package com.journaldev.servlet.async;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/fooz", name = "NullServlet", asyncSupported = true)
public class AsyncServletOne extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		resp.getWriter().println("Howdy from NullServlet1!");

		final AsyncContext ac = req.startAsync();

		ac.start(new Runnable() {
			public void run() {
				ac.dispatch("/baz");
			}
		});
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp){
		
		
	}
	

}
