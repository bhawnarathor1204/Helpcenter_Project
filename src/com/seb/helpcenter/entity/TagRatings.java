/**
 * 
 */
package com.seb.helpcenter.entity;


/**class Name : TagRatings
 * objective : This class contains the tag Ratings 
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public class TagRatings {
    private String tag;
    private int countAccess;
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public int getCountAccess() {
		return countAccess;
	}
	public void setCountAccess(int countAccess) {
		this.countAccess = countAccess;
	}
}
