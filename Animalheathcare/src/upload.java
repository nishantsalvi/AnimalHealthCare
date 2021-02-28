

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class upload
 */
@WebServlet("/upload")
public class upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path=request.getParameter("file");
		System .out.println("ergergergtrt");
		File file = new File(path);
		System .out.println("ergergergtrt");

		FileInputStream fileInputStream = new FileInputStream(file);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		while (fileInputStream.available()>0) {
		out.write(fileInputStream.read());
		}
		byte[] jpgByteArray = out.toByteArray();
		
		String q="insert into video values()";

		try{
			
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/animal_health_care", "root", "Nishantsalvi435");
			java.sql.PreparedStatement pst = con.prepareStatement(q);
			pst.setString(1,"Test1");
			pst.setBytes(2, jpgByteArray);
			pst.executeUpdate();
			
			ResultSet rs= pst.executeQuery();
			
			}catch(Exception e){
			System.out.println(e);
			}	
	
	}

}
