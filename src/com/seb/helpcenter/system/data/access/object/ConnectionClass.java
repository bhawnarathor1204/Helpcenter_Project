package com.seb.helpcenter.system.data.access.object;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.seb.helpcenter.entity.CategoryDetails;
import com.seb.helpcenter.entity.IssueCategory;

public class ConnectionClass {
	
	 static String DB_URL="jdbc:mysql://localhost:3306/help_desk1";
	 static String USER="root";
	 static String PWD="Bhawna@1204";
	 static Connection con=null;
	 
	public Connection getConnection() {
		try {
		Connection con=DriverManager.getConnection(DB_URL,USER,PWD);
		return con;
		}catch(SQLException e) {
			e.printStackTrace();
		}
        return con;
	}// getConnectionMethod close
	
	public void closeConnection() {
		try {
	      con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	      
	}// closeConnectionMethod close
	
	
	
	
	
}

