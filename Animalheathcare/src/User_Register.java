
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class newUser
 */
@WebServlet("/User_Register")
public class User_Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name =request.getParameter("Name");
		String email= request.getParameter("email");
		String phone_number=request.getParameter("number");
		String pass=request.getParameter("Pass");
		
		try{
			String q="insert into Register values(?,?,?,?)";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/animal_health_care", "root", "Nishantsalvi435");
		
		PreparedStatement pst = con.prepareStatement(q);
		pst.setString(1, name);
		pst.setString(2, email);
		pst.setString(3, phone_number);
		pst.setString(4,pass);
		int rs=pst.executeUpdate();
		response.sendRedirect("login.jsp");
		}catch (Exception e1) {
			System.out.println(e1);
		}
		
	}

}
