/**
 * 
 */
package com.seb.helpcenter.entity;

import java.sql.Date;

/**class Name : IssueCategory
 * objective : This class contains the entities of category 
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public class IssueCategory {
     
	
	@Override
	public String toString() {
		return "IssueCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDesc="
				+ categoryDesc + ", categoryStatus=" + categoryStatus + ", isGuest=" + isGuest + ", lastModifiedAt="
				+ lastModifiedAt + ", createdAt=" + createdAt + "]";
	}
	private int categoryId;
	private String categoryName;
	private String categoryDesc;
	private String categoryStatus;
	private boolean isGuest;
	private java.sql.Date lastModifiedAt;
	private java.sql.Date createdAt;
	
	public int getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getCategoryDesc() {
		return categoryDesc;
	}
	
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	
	public String getCategoryStatus() {
		return categoryStatus;
	}
	
	public void setCategoryStatus(String categoryStatus) {
		this.categoryStatus = categoryStatus;
	}
	
	public boolean getIsGuest() {
		return isGuest;
	}
	public void setIsGuest(boolean isGuest) {
		this.isGuest = isGuest;
	}
	
	public java.sql.Date getLastModifiedAt() {
		return lastModifiedAt;
	}
	public void setLastModifiedAt(java.sql.Date lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}
	public java.sql.Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(java.sql.Date createdAt) {
		this.createdAt = createdAt;
	}
	
}
