/**
 * 
 */
package com.seb.helpcenter.entity;

import java.util.Date;


/**class Name : Question
 * objective : This class contain the question and answer information
 * @author Bhawna Rathor
 * Date :24/03/22
 */

public class Question {
    private int QuestionId;
    private String fullAnswer;
    private int SubCategoryId;
    private String questionStatus;
    private String fullQuestion;
    private boolean isguest;
    private Date questionCreatedAt;
	public int getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}
	public String getFullAnswer() {
		return fullAnswer;
	}
	public void setFullAnswer(String fullAnswer) {
		this.fullAnswer = fullAnswer;
	}
	public int getSubCategoryId() {
		return SubCategoryId;
	}
	public void setSubCategoryId(int subCategoryId) {
		SubCategoryId = subCategoryId;
	}
	public String getQuestionStatus() {
		return questionStatus;
	}
	public void setQuestionStatus(String questionStatus) {
		this.questionStatus = questionStatus;
	}
	public String getFullQuestion() {
		return fullQuestion;
	}
	public void setFullQuestion(String fullQuestion) {
		this.fullQuestion = fullQuestion;
	}
	public boolean isIsguest() {
		return isguest;
	}
	public void setIsguest(boolean isguest) {
		this.isguest = isguest;
	}
	public Date getQuestionCreatedAt() {
		return questionCreatedAt;
	}
	public void setQuestionCreatedAt(Date questionCreatedAt) {
		this.questionCreatedAt = questionCreatedAt;
	}
    
	
	
}
