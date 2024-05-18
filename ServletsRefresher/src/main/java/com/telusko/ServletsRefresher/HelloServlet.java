package com.telusko.ServletsRefresher;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends  HttpServlet
{
	
	public void doGet ( HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		System.out.println("Hey sabu server Successful runninf");
		res.getWriter().println(" <body bgcolor='tomato' ><h1 style='color:white' > <b>Hey babu </b> </h1> </body>");
	}
}