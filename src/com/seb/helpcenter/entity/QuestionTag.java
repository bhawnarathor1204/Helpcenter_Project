/**
 * 
 */
package com.seb.helpcenter.entity;

/**class Name : QuestionTag 
 * objective : This class contain the question according to tag 
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public class QuestionTag {
	 private int tagId;
	 private int questionId;
	 private int questionTagId;
	 
	public int getTagId() {
		return tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getQuestionTagId() {
		return questionTagId;
	}
	public void setQuestionTagId(int questionTagId) {
		this.questionTagId = questionTagId;
	}
}
