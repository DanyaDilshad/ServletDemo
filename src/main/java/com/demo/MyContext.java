package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyContext")
public class MyContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ServletContext ctx = request.getServletContext();
		String name = ctx.getInitParameter("Name"); 
		
		PrintWriter out = response.getWriter();
		out.println("Name - " + name); 
		
	
		String id = ctx.getInitParameter("ID"); 
		
		out.println("ID - " + id); 
		
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	
	}

}
