package com.seb.helpcenter.entity;

/**class Name : QualityTracking
 * objective : This class track the user behavior
 * @author Bhawna Rathor
 * Date :24/03/22
 */

public class QualityTracking {
    private int qualityTrackingId;
    private int questionId;
    private boolean isLike;
    private int userIdQuality;
    private int userIdFk;
	public int getQualityTrackingId() {
		return qualityTrackingId;
	}
	public void setQualityTrackingId(int qualityTrackingId) {
		this.qualityTrackingId = qualityTrackingId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public Boolean getIsLike() {
		return isLike;
	}
	public void setIsLike(boolean isLike) {
		this.isLike = isLike;
	}
	public int getUserIdQuality() {
		return userIdQuality;
	}
	public void setUserIdQuality(int userIdQuality) {
		this.userIdQuality = userIdQuality;
	}
	public int getUserIdFk() {
		return userIdFk;
	}
	public void setUserIdFk(int userIdFk) {
		this.userIdFk = userIdFk;
	}
}
