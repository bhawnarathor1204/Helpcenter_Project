package com.seb.helpcenter.system.interfaces;

import java.util.Date;
import java.util.List;

import com.seb.helpcenter.entity.AnswerRatings;
import com.seb.helpcenter.entity.ResolveByDate;
import com.seb.helpcenter.entity.ResolveQuestionRatings;
import com.seb.helpcenter.entity.TagRatings;


/**class Name : SystemInterface 
 * objective : This interface contain the 4 methods
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public interface SystemInterface {
  

    List<AnswerRatings> getAnswerRatingsListByMostLikes();
    
    List<ResolveQuestionRatings> getQuestionMostResolved();
    
    List<TagRatings> getMostAccessedTags();
    
    List<ResolveByDate> countOfResolvedQuestion(Date startDate, Date endDate);

}
