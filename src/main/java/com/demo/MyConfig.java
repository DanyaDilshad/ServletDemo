package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/MyConfig", 
			initParams = { 
					@WebInitParam(name = "Name", value = "Dilshad"),
					@WebInitParam(name = "ID", value = "56789")}
			)
public class MyConfig extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig cg = getServletConfig();
		String name = cg.getInitParameter("Name"); 
		
		PrintWriter out = response.getWriter();
		out.println("Name - " + name); 
		
	
		String id = cg.getInitParameter("ID"); 
		
		out.println("ID - " + id); 
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);

	}

}
