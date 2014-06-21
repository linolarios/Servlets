/**
 * 
 */
package com.lino.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

/**
 * @author LINO LARIOS
 * 
 */
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest rq, HttpServletResponse rp)
			throws ServletException {
				
				PrintWriter writer = null;
				
				try{
					
					writer = rp.getWriter();
					writer.print("");
					writer.print("");
					writer.print("This response is generated from the plugged-in servlet");
					writer.print("");
					writer.print("");
					writer.flush();
				}catch(IOException e){
					System.out.println(e.getMessage());
					
				}finally{
					if(writer != null)
						writer.close();
				}
	}

}
