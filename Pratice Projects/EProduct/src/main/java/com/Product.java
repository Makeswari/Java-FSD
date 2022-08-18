package com;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		Properties props= new Properties();
		
		
		response.setContentType("text/html");
		
		int ID = Integer.parseInt(request.getParameter("ID"));
		
		
		String query="select * from product where id=?";
		out.print("<h1>Retrieved The Required Data  </h1>");
		out.print("<table border='5'><tr> <th>ID</th><th>PRODUCTNAME</th><th>PRICE</th></tr>");
		
	   try {
				 Connection  con=DatabaseConnection.getConnection(props);
					PreparedStatement st=  con.prepareStatement(query);
					st.setInt(1, ID);
			      
			      ResultSet rs =st.executeQuery();
			      while(rs.next()) {
			    	  
			    	  out.print("<tr><td>");
			    	  out.println(rs.getInt(1));
			    	  out.print("</td>");
			    	  out.print("<td>");
			    	  out.print(rs.getString(2));
			    	  out.print("</td>");
			    	  out.print("<td>");
			    	  out.print(rs.getString(3));
			    	  out.print("</td>");
			    	  out.print("</tr>");
			    
			    	  
					}
			      
					con.close();
			    
			    	  
					
				
				}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	   out.print("</table>");
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
