

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
		    PrintWriter out = response.getWriter();


		    String value = request.getParameter("Name");
		    System.out.println(value);
		    
		    try {
		        Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/animal_health_care", "root", "Nishantsalvi435");


		        Statement st = conn.createStatement();

		        st.executeUpdate("DELETE FROM register WHERE Name=" + value);
		        out.print(value);
		        
		        response.sendRedirect("manage.jsp");

		        conn.close();
		    }
		    catch(Exception e){
		        e.printStackTrace();
		    }
	}

}
