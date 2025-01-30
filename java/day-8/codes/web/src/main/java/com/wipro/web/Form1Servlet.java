package com.wipro.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/form1")
public class Form1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor=cyan>");
		out.println("<form action=form2 method=get>");
		out.println("<h2>");
		out.println("Name <input type=text name=t1 size=25><br><br>");
		out.println("Age <input type=text name=t2 size=25><br><br>");
		out.println("Address <input type=text name=t3 size=25><br><br>");
		out.println("<input type=submit value=SUBMIT>");
		out.println("</h2>");
		out.println("</form>");
		out.println("</body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
