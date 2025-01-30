package com.wipro.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");	
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>wipro technologies</title></head>");
		
		out.println("<body style=\"text-align:center;background:linear-gradient(to right, #02AABD, #00CDAC)\">");
		out.println("<h1>Wipro Technologies Limited</h1>");
		out.println("<img src=images/wipro.jpg style=\"width:250px; height: 250px; border-radius:50%\">");
		
		out.println("<p style=\"\font-size:18px; text-align:left;color:yellow\">Hello " + request.getParameter("txt_uid")+ "</p>");
		
		out.println("</body>");
		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
