package com.journaldev.servlet.async;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="AsyncNewServlet",urlPatterns = "/foo", asyncSupported = true)
public class AsyncNewServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest rq,HttpServletResponse rp) throws ServletException,IOException {
		
		
		System.out.println("im inside");
		
		final AsyncContext ctx = rq.getAsyncContext();
		
		ctx.start(new Runnable(){
			
			public void run(){
			System.out.println("im an asyncThread");	
			ctx.complete();
				
			}
			
		});
		
		System.out.println("Im leaving bye");
	}

}
