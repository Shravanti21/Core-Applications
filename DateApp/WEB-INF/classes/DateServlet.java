//DateServlet.java
package com.nt.servlet;

import jakarta.servlet.*;
import java.io.*;
import java.util.*;
public class DateServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
		{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		Date dt=new Date();
		pw.println("<h1 style=color:red;text-align:center> Date and time is::"+dt+"</h1>");
		pw.close();
		}
}