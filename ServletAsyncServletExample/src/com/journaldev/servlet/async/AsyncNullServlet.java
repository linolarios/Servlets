package com.journaldev.servlet.async;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/sync", name="NullServlet", asyncSupported=true)
public class AsyncNullServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {

        final AsyncContext ac = req.startAsync();

        try {
            Class<MyListener> forName = (Class<MyListener>) Class.forName("com.journaldev.servlet.async.MyListener");
			Class<MyListener> lClass = forName;
            AsyncListener al = ac.createListener(lClass);

            ac.addListener(al);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        ac.start(new Thread() {
            public void run() {
                ac.complete();
            }
        });
    }
}