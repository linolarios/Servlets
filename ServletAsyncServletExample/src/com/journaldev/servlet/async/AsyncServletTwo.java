package com.journaldev.servlet.async;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/baz/*", name = "NullServle2", asyncSupported = false)
public class AsyncServletTwo extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8303886081046639026L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		resp.getWriter().println("Howdy from NullServlet2!");
	}

}
