package com.sebone.home.db.pract;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
	
    static String DB_URL="jdbc:mysql://localhost:3306/help_desk1";
    static String USER_NAME="root";
    static String PWD="Bhawna@1204";
 
	public static void main(String[] args){
		try { 
			Connection con=DriverManager.getConnection(DB_URL,USER_NAME,PWD);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select catg_name,catg_id from issue_catg");
		    while(rs.next()) {
			  System.out.println(rs.getString("catg_name")); 
			  System.out.println(rs.getInt("catg_id")); 
		   }
		   con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
     
	}

}
