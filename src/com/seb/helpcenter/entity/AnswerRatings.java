/**
 * 
 */
package com.seb.helpcenter.entity;

/**class Name : AnswerRatings
 * objective : This class set the like or dislike answer which is given by user .
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public class AnswerRatings {
    private String Answer;
    private int countLike;
    private int countDisLike;
    
	public String getAnswer() {
		return Answer;
	}
	
	public void setAnswer(String answer) {
		Answer = answer;
	}
	
	public int getCountLike() {
		return countLike;
	}
	
	public void setCountLike(int countLike) {
		this.countLike = countLike;
	}
	
	public int getCountDisLike() {
		return countDisLike;
	}
	
	public void setCountDisLike(int countDisLike) {
		this.countDisLike = countDisLike;
	}
}
