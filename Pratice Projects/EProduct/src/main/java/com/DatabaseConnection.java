package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class DatabaseConnection
 */
@WebServlet("/DatabaseConnection")
public class DatabaseConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @throws ClassNotFoundException 
     * @see HttpServlet#HttpServlet()
     */
    public static Connection getConnection(Properties props) throws ClassNotFoundException {
    	Connection con=null;
    	
    	String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/product";
		String username="root";
		String password="Mahi@2001";
		
		try {
			//load driver
			Class.forName(driver);
			//get connection and store it con  object
			con=DriverManager.getConnection(url,username,password);
				
		}  catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
       
        // TODO Auto-generated constructor stub
    }

}
