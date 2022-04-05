/**
 * 
 */
package com.seb.helpcenter.entity;


/**class Name : Tag
 * objective : This class contains the tag id and tag tittle name
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public class Tag {
	 private int tagId;
	 private String tagTittleName;
	 
	 public int getTagId() {
		return tagId;
	 }
	 
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	
	public String getTagTittleName() {
		return tagTittleName;
	}
	
	public void setTagTittleName(String tagTittleName) {
		this.tagTittleName = tagTittleName;
	}
	 
	 
}
