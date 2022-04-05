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

public class IssueCategoryDAO extends ConnectionClass {
	
	
	 // method for insert data into table
      public boolean insert(IssueCategory issueCategory){
    	boolean flag=false;
		  try {
			  String sqlQuery="insert into issue_catg values(?,?,?,?,?,?,?)";
			  con = getConnection();
			  PreparedStatement stmt=con.prepareStatement(sqlQuery);
			  stmt.setLong(1,issueCategory.getCategoryId());
			  stmt.setString(2,issueCategory.getCategoryDesc());
			  stmt.setString(3,issueCategory.getCategoryName());
			  stmt.setDate(4,issueCategory.getCreatedAt());
			  stmt.setDate(5,issueCategory.getLastModifiedAt());
			  stmt.setString(6,issueCategory.getCategoryStatus());
			  stmt.setBoolean(7,issueCategory.getIsGuest());
			  int count=stmt.executeUpdate();
			  if(count==1) {
				  flag=true;
			  }
			 
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
		  }
		  return flag;
      }
      
     // method for select query
      public IssueCategory findCategoryDetailsById(int catgId) {
    	  IssueCategory issueCategory=new IssueCategory();
    	  String sqlQuery="select catg_id,catg_name from issue_catg where catg_id=?";
		  con = getConnection();
    	  try {
    		  PreparedStatement stmt=con.prepareStatement(sqlQuery);
    		  stmt.setInt(1, catgId);
        	  ResultSet rs=stmt.executeQuery();
  			  while(rs.next()) {
  				issueCategory.setCategoryName(rs.getString("catg_name"));
  				issueCategory.setCategoryId(rs.getInt("catg_id"));
  				issueCategory.setCategoryDesc(rs.getString("catg_desc"));
  				issueCategory.setCategoryStatus(rs.getString("catg_status"));
 				issueCategory.setCreatedAt(rs.getDate("catg_created_at"));
 				issueCategory.setLastModifiedAt(rs.getDate("catg_last_modified"));
  				issueCategory.setIsGuest(rs.getBoolean("catg_is_guest"));
  			}
  			con.close();
  		}catch(SQLException e) {
  			e.printStackTrace();
  		}	
    	  return issueCategory;
      }
      
      // method for update query
      public boolean update(IssueCategory issueCategory){
    	  boolean flag=false;
    	  int count=0;
    	  try {
    		  String sqlQuery="UPDATE issue_catg SET catg_name=? where catg_id=?";
    		  con = getConnection();
			  PreparedStatement stmt=con.prepareStatement(sqlQuery);
			  stmt.setString(1,issueCategory.getCategoryName());
			  stmt.setInt(2,issueCategory.getCategoryId());
			  count = stmt.executeUpdate();
			  //System.out.println(count);
			  if(count == 1) {
				  flag=true;
			  }
			  
    	  }catch(SQLException e) {
    		  e.printStackTrace();
    	  }
    	  return flag;
      }
      
     public boolean delete(int catgId){
    	boolean flag=false;
		  try {
			  String sqlQuery="delete from issue_catg where catg_id=?";
			  con = getConnection();
			  PreparedStatement stmt=con.prepareStatement(sqlQuery);
			  stmt.setInt(1,105);
			  int count=stmt.executeUpdate();
			  if(count==1) {
				  flag=true;
			  }
			 
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
		  }
		  return flag;
      }
     
    
}
