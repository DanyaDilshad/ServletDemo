package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/Add"})
public class Add extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		process(request, response);
				
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		process(request, response);
				
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		int result = i+j;
		PrintWriter out = response.getWriter();
		out.println("Sum is :" + result);
				
	}
	
}
