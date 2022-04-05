package com.seb.temp.db;

import java.sql.*;

import java.sql.DriverManager;
import java.util.ArrayList;


import com.seb.helpcenter.entity.IssueCategory;

public class ObjectList {
	static String DB_URL="jdbc:mysql://localhost:3306/help_desk1";
	static String USER="root";
	static String PWD="Bhawna@1204";
	
	public ArrayList<IssueCategory> getDetails(){
		ArrayList<IssueCategory> arrayList=new ArrayList<IssueCategory>();
		try {
			Connection con=DriverManager.getConnection(DB_URL,USER,PWD);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select Catg_id,catg_name from issue_catg");
			while(rs.next()) {
				IssueCategory issueCategory=new IssueCategory();
				issueCategory.setCategoryName(rs.getString("catg_name"));
				issueCategory.setCategoryId(rs.getInt("catg_id"));
				arrayList.add(issueCategory);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return arrayList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectList objectList=new ObjectList();
		ArrayList<IssueCategory>list=objectList.getDetails();
		for(IssueCategory i:list) {
			System.out.println(i.getCategoryId()+" "+i.getCategoryName());
		}
	}

}
