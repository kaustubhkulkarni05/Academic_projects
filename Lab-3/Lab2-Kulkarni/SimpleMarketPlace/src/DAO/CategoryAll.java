package DAO;

import java.io.Serializable;

public class CategoryAll implements Serializable{

	String[] allreviwerName;

	String[] description;
	String[] rating;
	String[] review;
	String[] element;
	String loginTime;
	String errorMessage;
	
	public String[] getDescription() {
		return description;
	}
	public void setDescription(String[] description) {
		this.description = description;
	}
	public String[] getRating() {
		return rating;
	}
	public void setRating(String[] rating) {
		this.rating = rating;
	}
	public String[] getReview() {
		return review;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public void setReview(String[] review) {
		this.review = review;
	}
	public String[] getElement() {
		return element;
	}
	public void setElement(String[] element) {
		this.element = element;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	
	
	public String[] getAllreviwerName() {
		return allreviwerName;
	}
	public void setAllreviwerName(String[] allreviwerName) {
		this.allreviwerName = allreviwerName;
	}
	
	
	
	


}
