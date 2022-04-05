package com.seb.helpcenter.entity;

/**class Name : QuestionAnswerDetails
 * objective : This class contain the question and answer information
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public class QuestionAnswerDetails {
    private int questionId;
    private String answer;
    
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
