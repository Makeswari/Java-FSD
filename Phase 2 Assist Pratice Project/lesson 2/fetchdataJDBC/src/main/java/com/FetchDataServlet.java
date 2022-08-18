package com;


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FetchDataServlet
 */
@WebServlet("/FetchDataServlet")
public class FetchDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out=  response.getWriter();
		
		Properties props= new Properties();
		
		
		response.setContentType("text/html");
		
		
	
		
		Connection  con=DBConfig.getConnection(props);
		InputStream in =getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		if(con!=null) {
			
			
			out.println("Connection is  Established");	
			try {
				
				Statement stmt = con.createStatement();
				ResultSet  rs=stmt.executeQuery("select * from eproduct");
				
				while(rs.next()) {
					out.println(rs.getInt(1)+" ,"+rs.getString(2)+", "
							+rs.getBigDecimal(3)+", "
							+rs.getTimestamp(4)+"<br>");
				}
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else{
			
			out.print("Error While Connecting Connections");
		}
			
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
