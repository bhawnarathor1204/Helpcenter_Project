package com.sebone.home.db.pract;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataObject {
	
	static String DB_URL="jdbc:mysql://localhost:3306/help_desk1";
	static String USER_NAME="root";
	static String PWD="Bhawna@1204";
	
    public IssueCategory getDetails(int id,String name) {
    	IssueCategory issueCategory =new IssueCategory();
    	issueCategory.setCatgName(name);
    	issueCategory.setCatgId(id);
    	return issueCategory;
    }
	public static void main(String[] args) {
		DataObject dataObject=new DataObject();
		try {
			Connection con=DriverManager.getConnection(DB_URL,USER_NAME,PWD);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select catg_id,catg_name from issue_catg");
			ArrayList<IssueCategory> arrayList=new ArrayList<IssueCategory>();
			while(rs.next()) {
		    	arrayList.add(dataObject.getDetails(rs.getInt("catg_id"),rs.getString("catg_name")));
			}
			for(IssueCategory i:arrayList) {
				System.out.println(i.getCatgId()+" "+i.getCatgName());
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
