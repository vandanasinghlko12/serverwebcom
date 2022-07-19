package com;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
	{																																																																																										
	
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
	String name	=req.getParameter("name1");
	String email=req.getParameter("email1");
	String pass=req.getParameter("pass1");
	String gender=req.getParameter("gender1");
	String[] lang=req.getParameterValues("lang1");
	String city=req.getParameter("city1");
	
	if (city.equals("Select City")) {
		
		resp.sendError(501, "Invalid City");
	}
	
	else {
	
	out.println("<html>");
	out.println("<head>");
	out.println("</head>");
	out.println("<body>");
	out.println("<table>"); 
	
	out.println("<tr>");
	out.println("<td> Name </td>");
	out.println("<td>" + name + "</td>");
	out.println("/tr");
	
	
	out.println("<tr>");
	out.println("<td> Email </td>");
	out.println("<td>" + email + "</td>");
	out.println("/tr");
	
	

	out.println("<tr>");
	out.println("<td> Gender </td>");
	out.println("<td>" + gender + "</td>");
	out.println("/tr");
	
	
	
	out.println("<tr>");
	out.println("<td> City </td>");
	out.println("<td>" + city+ "</td>");
	out.println("/tr");
	
	
	 
for(int i=0; i<lang.length; i++) {
	out.println("<tr>");
	out.println("<td> Languages </td>");
	out.println("<td>" + lang[i]+ "</td>");
	out.println("/tr");
	}
	
	
	out.println("/table");
	out.println("</body");
	out.println("</html>");
	}
	
	}

}
