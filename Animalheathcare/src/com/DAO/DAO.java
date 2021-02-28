package com.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class DAO {
	
	String q="select * from register where email=? and pass=?";
	
	public boolean check(String email,String pass){
	
		try{
			System.out.println("enter in try ");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/animal_health_care", "root", "Nishantsalvi435");
			java.sql.PreparedStatement pst = con.prepareStatement(q);
			pst.setString(1, email);
			pst.setString(2, pass);
			
			ResultSet rs= pst.executeQuery();
			System.out.println("end try ");
			if(rs.next()){
				System.out.println("drhdhdghfgh");
				return true;
			}
			}catch(Exception e){
			System.out.println(e);
			}	
			return false;
		
	}


}
