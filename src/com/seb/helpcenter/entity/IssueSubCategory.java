/**
 * 
 */
package com.seb.helpcenter.entity;

import java.util.Date;

/**class Name : IssueSubCategory
 * objective : This class contains the entities of subcategory 
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public class IssueSubCategory {

	private long subcategoryId;
	private String subcategoryName;
	private String subcategoryDesc;
	private String subcategoryStatus;
	private Date subcreatedAt;
	
	public long getSubcategoryId() {
		return subcategoryId;
	}
	
	public void setSubcategoryId(long subcategoryId) {
		this.subcategoryId = subcategoryId;
	}
	
	public String getSubcategoryName() {
		return subcategoryName;
	}
	
	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}
	
	public String getSubcategoryDesc() {
		return subcategoryDesc;
	}
	public void setSubcategoryDesc(String subcategoryDesc) {
		this.subcategoryDesc = subcategoryDesc;
	}
	public String getSubcategoryStatus() {
		return subcategoryStatus;
	}
	public void setSubcategoryStatus(String subcategoryStatus) {
		this.subcategoryStatus = subcategoryStatus;
	}
	public Date getSubcreatedAt() {
		return subcreatedAt;
	}
	public void setSubcreatedAt(Date subcreatedAt) {
		this.subcreatedAt = subcreatedAt;
	}
}
