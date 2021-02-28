

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Check_adminDAO {
	 
		 public boolean admincheck(String email,String pass){
				String q="select * from admin where email=? and pass=?";
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/animal_health_care", "root", "Nishantsalvi435");
					java.sql.PreparedStatement pst = con.prepareStatement(q);
					pst.setString(1, email);
					pst.setString(2, pass);
					
					ResultSet rs= pst.executeQuery();
					
					if(rs.next()){
						return true;
					}
					else {
						System.out.println("no admin recorde found ");
					}
				}catch(Exception e){
					System.out.println(e);
				}	
		 return false;
	 }

}
