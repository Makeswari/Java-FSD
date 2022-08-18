package demo;
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
import java.io.IOException;
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
       
   @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		
		Properties props = new Properties();
		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		
		
		String SearchId = request.getParameter("id");
		Connection conn =DBConfig.getConnection(props);
		if(conn!=null) {
			if(SearchId==null) {
				try {
					Statement stmt = conn.createStatement();
					ResultSet rs =stmt.executeQuery("select * from eproduct");
					out.print("<table border=1 cellpadding=10 cellspacing=0><thead><tr>");
					out.print("<th>ID</th><th>NAME</th><th>PRICE</th><th>DATE</th>");
					out.print("<tr></thead>");
					out.print("<tbody>");
					while(rs.next()) {
						out.print("<tr>");
						out.print("<td>'"+rs.getInt(1)+"'</td><td>'"+rs.getString(2)+"'</td><td>'"+rs.getBigDecimal(3)+"'</td><td>'"+rs.getTimestamp(4)+"'</td>");
						out.print("</tr>");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				try {
					Statement stmt = conn.createStatement();
					ResultSet rs =stmt.executeQuery("select * from eproduct where id="+SearchId);
					out.print("<table border=1 cellpadding=10 cellspacing=0> <thead><tr>");
					out.print("<th>ID</th><th>NAME</th><th>PRICE</th><th>DATE</th>");
					out.print("<tr></thead>");
					out.print("<tbody>");
					
					while(rs.next()) {
						
						out.print("<tr>");
						out.print("<td>'"+rs.getInt(1)+"'</td><td>'"+rs.getString(2)+"'</td><td>'"+rs.getBigDecimal(3)+"'</td><td>'"+rs.getTimestamp(4)+"'</td>");
						out.print("</tr>");
					}
					
					out.print("</tbody></table>");

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
				
				
			
			
		}
			
				}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
