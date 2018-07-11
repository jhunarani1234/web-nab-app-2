package com.monami.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FirstServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		String x = config.getInitParameter("x");
		String y = config.getInitParameter("y");
		String a = config.getInitParameter("a");

		response.setContentType("text/html");
		out.println("First Servlet Working <br/>");
		out.print("Servlet Config: " + config);
		out.println("<br/>"+"x: " + x);
		out.println("<br/>"+"y: " + y);
		out.println("<br/>"+"a: " + a);

		out.close();
	}

}
// 