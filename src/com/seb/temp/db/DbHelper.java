package com.seb.temp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbHelper {
 
	static String DB_URL="jdbc:mysql://localhost:3306/help_desk1";
	static String USER="root";
	static String PWD="Bhawna@1204";
	static Connection con=null;
	public static void main(String[] args)throws SQLException{
		try {
			Connection con=DriverManager.getConnection(DB_URL,USER,PWD);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select catg_id ,catg_name from issue_catg");
			while(rs.next()) {
				System.out.println("id = "+rs.getInt("catg_id"));
				System.out.println("Name = "+rs.getString("catg_name"));
				
			}
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		
      
	}

}
