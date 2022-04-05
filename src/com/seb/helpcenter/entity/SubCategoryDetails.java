/**
 * 
 */
package com.seb.helpcenter.entity;

import java.util.List;

/**class Name :SubCategoryDetails 
 * objective : This class contains the subCategory details
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public class SubCategoryDetails {
   private List<IssueSubCategory> subCategoryDetails;

	public List<IssueSubCategory> getSubCategoryDetails() {
		return subCategoryDetails;
	}
	
	public void setSubCategoryDetails(List<IssueSubCategory> subCategoryDetails) {
		this.subCategoryDetails = subCategoryDetails;
	}
}
