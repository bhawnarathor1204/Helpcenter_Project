package com.sebone.home.db.pract;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertPre {
	static String DB_URL="jdbc:mysql://localhost:3306/help_desk1";
	static String USER="root";
	static String PWD="Bhawna@1204";
	
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 try {
		 Connection con=DriverManager.getConnection(DB_URL,USER,PWD);
		 String query="insert into user values (?,?)";
		 PreparedStatement pt=con.prepareStatement(query);
		 
		 while(true) {
			 System.out.println("enter user id = ");
			 int user_id=sc.nextInt();
			 sc.nextLine();
			 System.out.println("enter user name = ");
			 String user_name=sc.nextLine();
			 pt.setInt(1, user_id);
			 pt.setString(2, user_name);
			 pt.executeUpdate();
			 System.out.println("Do you want to insert more element ");
			 String option=sc.nextLine();
			 if(option.equalsIgnoreCase("No")) {
				break;
			  }	
		     }
			 }catch(SQLException e) {
				 e.printStackTrace();
			 }
      sc.close();
	}

}
