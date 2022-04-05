/**
 * 
 */
package com.seb.helpcenter.entity;

import java.util.Date;
import java.util.List;


/**class Name : ResolveByDate 
 * objective : This class contain the resolved number according to date
 * @author Bhawna Rathor
 * Date :24/03/22
 */
public class ResolveByDate {
    private Date dateFrom;
    private Date dateTo;
    private List<Integer> ListOfNumberOfResolve;
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public List<Integer> getListOfNumberOfResolve() {
		return ListOfNumberOfResolve;
	}
	public void setListOfNumberOfResolve(List<Integer> listOfNumberOfResolve) {
		ListOfNumberOfResolve = listOfNumberOfResolve;
	}
}
