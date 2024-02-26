package com.educlaas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestingServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		pw.println("<HTML>");
		pw.println("<Body><h1> This is Testing Servlet is working </h1> </body>");
		pw.close();
	}

	//////////////// This is testing Servlet Life Cycle /////////////////////////////
	
	int i;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init Method");
		i=1;
		super.init(config);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service Method");
		i++;
		System.out.println("I is "+i);
		super.service(req, resp);
		destory();
		
	}
	
	private void destory() {
		// TODO Auto-generated method stub
		i=0;
		System.out.println("After Destory I is "+i);
		System.out.println("Destory Method");
		// TODO Auto-generated method stub
	}
}
