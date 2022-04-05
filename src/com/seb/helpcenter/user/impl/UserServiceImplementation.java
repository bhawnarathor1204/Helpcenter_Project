package com.seb.helpcenter.user.impl;

import java.util.List;

import com.seb.helpcenter.entity.CategoryDetails;
import com.seb.helpcenter.entity.IssueCategory;
import com.seb.helpcenter.entity.IssueSubCategory;
import com.seb.helpcenter.entity.Question;
import com.seb.helpcenter.entity.QuestionAnswerDetails;
import com.seb.helpcenter.entity.SubCategoryDetails;
import com.seb.helpcenter.entity.Tag;
import com.seb.helpcenter.entity.User;
import com.seb.helpcenter.entity.UserTracking;


/**class Name : UserServiceImplementation 
 * objective : This interface contain the 6 methods 
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public class UserServiceImplementation {

	/* Method Name :- getCategoryByUser
     * Objective :- This Method get the category list 
     * @Param :- boolean isGuest
     * @return  :-CategoryDetails object
     */
    CategoryDetails getCategoryByUser(Boolean isGuest) {
    	return null;
    }
    
    /* Method Name :-getSubCategoryByCategoryId
     * Objective :- This Method get the answer rating list
     * @Param :- it takes 2 paramter CategoryId,trackingId
     * @return  :-SubCategoryDetails object 
     */
	SubCategoryDetails getSubCategoryByCategoryId(IssueCategory CategoryId , UserTracking trackingId) {
		return null;
	}
	
	/* Method Name :-getQuestionBySubCategoryId
     * Objective :- This Method get the answer rating list
     * @Param :- it takes 2 paramter SubCategoryId,trackingId
     * @return  :- List<AnswerRatings>;
     */
	List<Question> getQuestionBySubCategoryId(IssueSubCategory SubCategoryId, UserTracking  trackingId){
		return null;
	}
	
	/* Method Name :-getAnswerByQuestionId
     * Objective :- This Method get the answer rating list
     * @Param :- it takes 1 parameter QuestionId
     * @return  :-QuestionAnswerDetails;
     */
	QuestionAnswerDetails getAnswerByQuestionId(Question QuestionId) {
		return null;
	}
	
	/* Method Name :-SetLikeOrDislikeOnAnswer
     * Objective :- This Method set the like or dislike on question given by the user
     * @Param :-  it has 3 parameter QuestionId,isLike,userId
     * @return  :- Integer ;
     */
	Integer SetLikeOrDislikeOnAnswer(Question QuestionId ,Boolean isLike ,User userId) {
		return null;
	}
	
	/* Method Name :-getQusetionByTag
     * Objective :- This Method get the answer rating list
     * @Param :- it has 1 parameter tagTittleName
     * @return  :- List<Question>;
     */
	List<Question> getQusetionByTag(Tag tagTittleName){
		return null;
	}
}
