package com.monami.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SecondServlet() {
        super();
    	}

    	protected void doGet(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {

    		PrintWriter out = response.getWriter();
    		ServletConfig config = getServletConfig();
    		String a = config.getInitParameter("a");
    		String b = config.getInitParameter("b");
    		String x = config.getInitParameter("x");

    		response.setContentType("text/html");
    		out.println("First Servlet Working <br/>");
    		out.print("Servlet Config: " + config);
    		out.println("<br/>"+"a: " + a);
    		out.println("<br/>"+"b: " + b);
    		out.println("<br/>"+"x: " + x);

    		out.close();

}
}

