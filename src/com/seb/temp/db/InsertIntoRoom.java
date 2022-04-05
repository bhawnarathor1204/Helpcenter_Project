package com.seb.temp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertIntoRoom {
	
	static String DB_URL="jdbc:mysql://localhost:3306/help_desk1";
	static String USER="root";
	static String PWD="Bhawna@1204";
	Connection con=null;
	public static void main(String[] args)throws SQLException {
		Scanner sc=new Scanner(System.in);
		try {
		Connection con=DriverManager.getConnection(DB_URL,USER,PWD);
		String sql="insert into room values(?,?)";
		PreparedStatement pt=con.prepareStatement(sql);
		
		while(true) {
			System.out.println("Enter room id= ");
			int room_id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter room name = ");
			String room_name=sc.nextLine();
			pt.setInt(1,room_id);
			pt.setString(2,room_name);
			pt.executeUpdate();
			System.out.println("Do you want to insert one more record = ");
			String option=sc.next();
			if(option.equalsIgnoreCase("No")) {
				break;
			}
			
		}
		con.close();
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		sc.close();
	}

}
