/**
 * 
 */
package com.seb.helpcenter.entity;

import java.util.List;

/**class Name : CategoryDetails
 * objective : This class provide the details of category list
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public class CategoryDetails {
    private List<IssueCategory> categoryDetails;
    private int trackingId;
    
	/**
	 * @param categoryDetails
	 * @param trackingId
	 */
	public CategoryDetails(List<IssueCategory> categoryDetails, int trackingId) {
		super();
		this.categoryDetails = categoryDetails;
		this.trackingId = trackingId;
	}

	
	@Override
	public String toString() {
		return "CategoryDetails [categoryDetails=" + categoryDetails + ", trackingId=" + trackingId + "]";
	}


	/**
	 * 
	 */
	public CategoryDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<IssueCategory> getCategoryDetails() {
		return categoryDetails;
	}
	
	public void setCategoryDetails(List<IssueCategory> categoryDetails) {
		this.categoryDetails = categoryDetails;
	}
	
	public int getTrackingId() {
		return trackingId;
	}
	
	public void setTrackingId(int trackingId) {
		this.trackingId = trackingId;
	}
}
