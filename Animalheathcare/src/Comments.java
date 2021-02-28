

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Comments
 */
@WebServlet("/Comments")
public class Comments extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String comment=request.getParameter("comment");
		HttpSession session = request.getSession();
		String email=(String)session.getAttribute("email"); 
		Object email1=session.getAttribute("email"); 
		
		try{
			String q="insert into comments values(default,?,?)";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/animal_health_care", "root", "Nishantsalvi435");
			System.out.println("dvgdvydfvyefub");	
		
		PreparedStatement pst = con.prepareStatement(q);
		pst.setString(1, (String) email1);
		pst.setString(2, comment);
		

		int rs=pst.executeUpdate();
		System.out.println(rs);
		response.sendRedirect("review.jsp");
	
		}catch (Exception e1) {
			System.out.println(e1);
		}
		
	}

	

}
