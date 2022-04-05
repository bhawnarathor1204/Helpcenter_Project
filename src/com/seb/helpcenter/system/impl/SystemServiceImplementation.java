package com.seb.helpcenter.system.impl;

import java.util.Date;
import java.util.List;

import com.seb.helpcenter.entity.AnswerRatings;
import com.seb.helpcenter.entity.ResolveByDate;
import com.seb.helpcenter.entity.ResolveQuestionRatings;
import com.seb.helpcenter.entity.TagRatings;


/**class Name :SystemServiceImplementation 
 * objective : This interface implements the 4 methods 
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public class SystemServiceImplementation {
	  

	    /* Method Name :-getAnswerRatingsListByMostLikes
	     * Objective :- This Method get the answer rating list
	     * @Param :- no paramter needed
	     * @return  :- List<AnswerRatings>;
	     */
	    List<AnswerRatings> getAnswerRatingsListByMostLikes(){
	    	return null;
	    }
	    
	    
	    /* Method Name :-getQuestionMostResolved
	     * Objective :- This Method return the most resolved question
	     * @Param :-no parameter needed
	     * @return  :-List<ResolveQuestionRatings>;
	     */
	    List<ResolveQuestionRatings> getQuestionMostResolved(){
	    	return null;
	    }
	    
	    
	    /* Method Name :-getMostAccessedTags
	     * Objective :- This Method return the most access tag
	     * @Param :-no parameter needed
	     * @return  :-List<TagRatings>;
	     */
	    List<TagRatings> getMostAccessedTags(){
	    	return null;
	    }
	    
	    /* Method Name :-ResolveByDate
	     * Objective :- This Method count of resolved question
	     * @Param :-no parameter needed
	     * @return  :- List<ResolveByDate>;
	     */
	    List<ResolveByDate> countOfResolvedQuestion(Date startDate, Date endDate){
	    	return null;
	    }
}
