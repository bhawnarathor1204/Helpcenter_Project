package com.seb.helpcenter.user.interfaces;

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


/**class Name :UserInterface 
 * objective : This interface contain the 6 methods 
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public interface UserInterface {
   
    CategoryDetails getCategoryByUser(Boolean isGuest);
    
	SubCategoryDetails getSubCategoryByCategoryId(IssueCategory CategoryId , UserTracking trackingId);
	
	List<Question> getQuestionBySubCategoryId(IssueSubCategory SubCategoryId, UserTracking  trackingId);
	
	QuestionAnswerDetails getAnswerByQuestionId(Question QuestionId);
	
	Integer SetLikeOrDislikeOnAnswer(Question QuestionId ,Boolean isLike ,User userId);
	
	List<Question> getQusetionByTag(Tag tagTittleName);


}
