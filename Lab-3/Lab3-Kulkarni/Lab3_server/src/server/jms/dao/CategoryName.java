package server.jms.dao;

import java.io.Serializable;

public class CategoryName implements Serializable {
	
	String[] categoryName;
	String[] categoryDescription;
	String errorMessage;
	

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String[] getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String[] categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String[] getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String[] categoryName) {
		this.categoryName = categoryName;
	}

	
	
}
