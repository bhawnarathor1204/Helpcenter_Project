package com.seb.temp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectPrepared {
	static String DB_URL="jdbc:mysql://localhost:3306/help_desk1";
	static String USER="root";
	static String PWD="Bhawna@1204";
	static Connection con=null;
	
	public IssueCategoryDetails getDetails(int id,String name) {
		IssueCategoryDetails issueCategoryDetails =new IssueCategoryDetails();
		issueCategoryDetails.setCatgId(id);
		issueCategoryDetails.setCatgName(name);
		return issueCategoryDetails;
	}
	
    public List<IssueCategoryDetails> getConnection(int catg_Id){
    	List<IssueCategoryDetails> arrayList=new ArrayList<IssueCategoryDetails>();
    	try {
			Connection con=DriverManager.getConnection(DB_URL,USER,PWD);
			String query="select catg_id,catg_name from issue_catg where catg_id=?";
			PreparedStatement pt=con.prepareStatement(query);
			pt.setInt(1,catg_Id);
			ResultSet rs=pt.executeQuery();
			while(rs.next()) {
				ObjectPrepared objectPrepared =new ObjectPrepared();
				arrayList.add(objectPrepared.getDetails(rs.getInt("catg_Id"),rs.getString("catg_name")));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
    	return arrayList;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ObjectPrepared objectPrepared =new ObjectPrepared();
		System.out.println("Enter any id to fecth record");
		int a=sc.nextInt();
		List<IssueCategoryDetails> arrayList=objectPrepared .getConnection(a);
		for(IssueCategoryDetails i:arrayList) {
			System.out.println(i.getCatgId()+" "+i.getCatgName());
		}
      
	}

}
