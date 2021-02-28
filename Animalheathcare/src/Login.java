
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.DAO;
import com.sun.net.httpserver.Filter.Chain;


@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String email =request.getParameter("email");
		String pass =request.getParameter("Pass");
		
		System.out.println(email);
		System.out.println(pass);
		DAO dao = new DAO();
		Check_adminDAO check=new Check_adminDAO();
		if(check.admincheck(email, pass)){
		HttpSession session = request.getSession();
		session.setAttribute("email", email);
		response.sendRedirect("admin_home.jsp");
		}else
		if(dao.check(email, pass)){
			HttpSession session = request.getSession();
			session.setAttribute("email", email );
			response.sendRedirect("home.jsp");
		}else{
			PrintWriter out = response.getWriter();
			System.out.println("No recorde found");
			response.sendRedirect("login.jsp");
			
		}
	}

	
}
