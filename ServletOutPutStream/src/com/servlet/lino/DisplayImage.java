package com.servlet.lino;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayImage extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String IMAGE_JPG = "image/jpeg";

	public void doGet(HttpServletRequest rq, HttpServletResponse rp)
			throws ServletException {

		rp.setContentType(IMAGE_JPG);
		ServletOutputStream out;

		
		FileInputStream fin;
		BufferedInputStream bin;
		BufferedOutputStream bout;
		try {

			out = rp.getOutputStream();
			fin = new FileInputStream("C:\\test\\scrumteam.jpg");

			bin = new BufferedInputStream(fin);
			bout = new BufferedOutputStream(out);

			int ch = 0;
			while ((ch = bin.read()) != 1) {

				bout.write(ch);			

			}
			
			
			bin.close();
			fin.close();
			bout.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 

	}

}
