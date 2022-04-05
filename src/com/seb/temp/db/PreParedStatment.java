package com.seb.temp.db;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreParedStatment {
	static String DB_URL="jdbc:mysql://localhost:3306/help_desk1";
	static String USER="root";
	static String PWD="Bhawna@1204";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Connection con=DriverManager.getConnection(DB_URL,USER,PWD);
			String sqlQuery="insert into tag values(?,?)";
			PreparedStatement stmt=con.prepareStatement(sqlQuery);
			
			while(true) {
				System.out.println("Enter tag id = ");
				int tag_id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter tag_tittle = ");
				String tag_tittle=sc.nextLine();
				stmt.setInt(1,tag_id);
				stmt.setString(2,tag_tittle);
				stmt.executeUpdate();
				System.out.println("DO you want to insert more record  = ");
				String option=sc.next();
				if(option.equalsIgnoreCase("No")) {
					break;
				}	
			}
			con.close();
		}// try close
		catch(SQLException e) {
				e.printStackTrace();
		}//catch close	
		sc.close();
      }
}

