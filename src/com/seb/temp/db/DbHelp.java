package com.seb.temp.db;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import com.seb.helpcenter.entity.CategoryDetails;
import com.seb.helpcenter.entity.IssueCategory;

public class DbHelp {
	
	static String DB_URL="jdbc:mysql://localhost:3306/help_desk1";
	static String USER="root";
	static String PWD="Bhawna@1204";
    
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection(DB_URL,USER,PWD);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select catg_id ,catg_name from issue_catg");
			ArrayList<IssueCategory> arrayList=new ArrayList<IssueCategory>();
			while(rs.next()) {
				IssueCategory issueCategory=new IssueCategory();
				issueCategory.setCategoryName(rs.getString("Catg_name"));
				issueCategory.setCategoryId(rs.getInt("Catg_id"));
				arrayList.add(issueCategory);
			}
			CategoryDetails categoryDetails=new CategoryDetails(arrayList,123);
			for(IssueCategory i:categoryDetails.getCategoryDetails()) {
				System.out.println(i);
			}
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		

	}

}
