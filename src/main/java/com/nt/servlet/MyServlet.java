package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/dateurl")
public class MyServlet extends HttpServlet {
	

   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 //get PrintWriter object
		PrintWriter pw = response.getWriter();
		 // set response content type 
		response.setContentType("text/html");
		//Write b logic
		Date date = new Date();
		//write the response
		pw.print("<h1 style='color:red; text-align:center'>Date and Time: "+date+"</h1>");
		//add home hyperlink
		pw.print("<br><a href='index.jsp'>Home</a>");
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
