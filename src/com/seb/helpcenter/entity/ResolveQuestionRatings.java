/**
 * 
 */
package com.seb.helpcenter.entity;

/**class Name : ResolveQuestionRatings
 * objective : This class contain the resolved question by ratings 
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public class ResolveQuestionRatings {
   private int questionId;
   private String question;
   private int isResolved;
   private int countIsPending;
   
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getIsResolved() {
		return isResolved;
	}
	public void setIsResolved(int isResolved) {
		this.isResolved = isResolved;
	}
	public int getCountIsPending() {
		return countIsPending;
	}
	public void setCountIsPending(int countIsPending) {
		this.countIsPending = countIsPending;
}
}
