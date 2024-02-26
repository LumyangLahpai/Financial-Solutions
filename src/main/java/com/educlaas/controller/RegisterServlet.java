package com.educlaas.controller;

import java.io.IOException;
import java.sql.*;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Business Logic
		
		//1.collect the req data from jsp
		
		String userName=req.getParameter("user_name");
		String userEmail=req.getParameter("user_email");
		String userPass=req.getParameter("user_password");
		
		System.out.println("This is Register Servlet");
		
		System.out.println("Name is "+userName);
		System.out.println("Email is "+userEmail);
		System.out.println("Pass is "+userPass);
		
		
		//2. Save the data to the database
		
			//Steps to connect with database (java<=>database)
				
				try {
					//Register the driver class
					 Class.forName("com.mysql.jdbc.Driver"); 
					 
					 //Creating Connection
					 String strURL = "jdbc:mysql://localhost/person"; 
					Connection con= DriverManager.getConnection(strURL, "root", "Admin1234");
					
					System.out.println("connection succeeded."); 
					
					//Creating Statement
					Statement stmt=con.createStatement();
				
					String SQLQuery="insert into user (username,email,password) values('"+userName+"','"+userEmail+"','"+userPass+"')";
					
					//Executing Queries
					stmt.executeUpdate(SQLQuery);
					System.out.println("User data successfully save to the database");
					
					//Close Connection
					con.close();


					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				
	    //3. Display Thank you page. Dispath to the another JSP
		RequestDispatcher rd=req.getRequestDispatcher("thankyou.jsp");
		rd.forward(req, resp);
			
		
	}

}
