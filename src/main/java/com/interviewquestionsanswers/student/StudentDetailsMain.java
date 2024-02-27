package com.interviewquestionsanswers.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StudentDetailsMain {

	public static void main(String[] args) {

		
		
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/organization","root","ecommerce123@D");  
			//here sonoo is database name, root is username and password  
			java.sql.Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from student");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
				
	}
