package com.sebone.home.db.pract;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentFromIssueCatg {

	static String DB_URL="jdbc:mysql://localhost:3306/help_desk1";
	static String USER_NAME="root";
	static String PWD="Bhawna@1204";
	
    public StudentDetails getDetails(int id,String name) {
    	StudentDetails StudentDetails=new StudentDetails();
    	StudentDetails.setRollNumber(id);
    	StudentDetails.setClassName(name);
    	return StudentDetails;
    }
	public static void main(String[] args) {
		StudentFromIssueCatg studentFromIssueCatg=new StudentFromIssueCatg();
		try {
			Connection con=DriverManager.getConnection(DB_URL,USER_NAME,PWD);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select catg_id,catg_name from issue_catg");
			ArrayList<StudentDetails> arrayList=new ArrayList<StudentDetails>();
			while(rs.next()) {
		    	arrayList.add(studentFromIssueCatg.getDetails(rs.getInt("catg_id"),rs.getString("catg_name")));
			}
			for(StudentDetails i:arrayList) {
				System.out.println(i.getRollNumber()+" "+i.getClassName());
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
