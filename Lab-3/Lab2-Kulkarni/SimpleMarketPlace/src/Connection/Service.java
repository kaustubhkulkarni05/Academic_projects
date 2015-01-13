package Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebService;

import DAO.CategoryAll;
import DAO.CategoryDisplay;
import DAO.CategoryName;

@WebService
public class Service {
	DatabaseConnection db = new DatabaseConnection();

	public String signUp(String fname, String lname, String uname, String pwd) {
		System.out.println("Inside Signup");
		String result;

		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
		java.util.regex.Matcher m = p.matcher(uname);

		if (m.matches() == true && pwd.length() >= 6 && fname != null
				&& lname != null) {
			result = db.signUp(fname, lname, uname, pwd);
			return result;
		} else {
			result = "Invalid user";
			return result;
		}

		/**
		 * This space is left for validation and manipulation of input values
		 * entered by the user as a part of the server side validation
		 */

		// result = db.signUp(fname,lname,uname,pwd);

		// return result;//this value is returned to the calling servlet
	}

	public CategoryDisplay addComments(String reviwer_name, String description,
			String rating, String review, String Element) {
		System.out.println("Inside Add Comments");
		CategoryDisplay result = new CategoryDisplay();
		System.out.println("reviwer name" + reviwer_name);
		System.out.println("Restaurant" + Element);
		/**
		 * This space is left for validation and manipulation of input values
		 * entered by the user as a part of the server side validation
		 */

		if (reviwer_name == null || Element == null) {
			result.setErrorMessage("Invalid Input");
			return result;

		} else {
			result = db.addComments(reviwer_name, description, rating, review,
					Element);
			return result;
		}

		// return result;//this value is returned to the calling servlet
	}

	public CategoryDisplay deleteComments(String reviwer_name, String Element) {
		System.out.println("Inside Delete Comments");
		CategoryDisplay result = new CategoryDisplay();

		/**
		 * This space is left for validation and manipulation of input values
		 * entered by the user as a part of the server side validation
		 */
		
		if (reviwer_name == null || Element == null) {
			result.setErrorMessage("Invalid Input");
			return result;

		} else {
			result = db.deleteComments(reviwer_name, Element);
			return result;
		}
		

	}

	public CategoryDisplay updateComments(String reviwer_name,
			String description, String rating, String review, String Element) {
		System.out.println("Inside Update Comments");
		CategoryDisplay result = new CategoryDisplay();

		/**
		 * This space is left for validation and manipulation of input values
		 * entered by the user as a part of the server side validation
		 */
		
		if (reviwer_name == null || Element == null) {
			result.setErrorMessage("Invalid Input");
			return result;

		} else {
			result = db.updateComments(reviwer_name, description, rating, review,
					Element);
			return result;
		}


	}

	public CategoryDisplay signIn(String uname, String pwd) {
		System.out.println("Inside Signin");
		CategoryDisplay result = new CategoryDisplay();

		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
		java.util.regex.Matcher m = p.matcher(uname);

		if (m.matches() == true && pwd.length() >= 6) {
			db.updateTime(uname, pwd);
			result = db.signIn(uname, pwd);
			return result;
		} else {
			result.setErrorMessage("Invalid user");
			return result;
		}

		// **This space is left for validation and manipulation of
		// input values entered by the user as a part of the server side
		// validation//*

		// return result;//this value is returned to the calling servlet
	}

	public CategoryAll showAllCategory() {
		System.out.println("Inside show all acategory");
		CategoryAll result = new CategoryAll();

		// **This space is left for validation and manipulation of
		// input values entered by the user as a part of the server side
		// validation//*

		result = db.showAllCategory();

		return result;// this value is returned to the calling servlet
	}

	public CategoryName homePage() throws SQLException {
		System.out.println("Inside Home");
		CategoryName result = new CategoryName();

		/**
		 * This space is left for validation and manipulation of input values
		 * entered by the user as a part of the server side validation
		 */

		result = db.homePage();

		if (result.getCategoryName().length > 0) {
			return result;
		} else {
			return null;
		}

		// return result;//this value is returned to the calling servlet
	}

	public CategoryName displayCategory() throws SQLException {
		System.out.println("Inside Home");
		CategoryName result = new CategoryName();

		/**
		 * This space is left for validation and manipulation of input values
		 * entered by the user as a part of the server side validation
		 */

		result = db.displayCategory();

		if (result.getCategoryName().length > 0) {
			return result;
		} else {
			return null;
		}

	}

	public CategoryName addCategory(String categoryName,
			String categoryDescription) {
		System.out.println("Inside addCategory");
		CategoryName result = new CategoryName();

		/**
		 * This space is left for validation and manipulation of input values
		 * entered by the user as a part of the server side validation
		 */
		System.out.println("Inside addCategory category name :--"+categoryName);
		
		if (categoryName == null) {
			result.setErrorMessage("Invalid Input");
			return result;

		} else {
			result = db.addCategory(categoryName, categoryDescription);
			return result;//this value is returned to the calling servlet
		}

	}

	public CategoryName deleteCategory(String categoryName) {
		System.out.println("Inside addCategory");
		CategoryName result = new CategoryName();

		/**
		 * This space is left for validation and manipulation of input values
		 * entered by the user as a part of the server side validation
		 */
		
		if (categoryName == null) {
			result.setErrorMessage("Invalid Input");
			return result;

		} else {
			result = db.deleteCategory(categoryName);
			return result;//this value is returned to the calling servlet
		}

	}

	public CategoryName updateCategory(String oldCategoryName,
			String newCategoryName, String categoryDescription) {
		System.out.println("Inside update category");
		CategoryName result = new CategoryName();

		/**
		 * This space is left for validation and manipulation of input values
		 * entered by the user as a part of the server side validation
		 */
		
		if (oldCategoryName == null || newCategoryName == null) {
			result.setErrorMessage("Invalid Input");
			return result;

		} else {
			result = db.updateCategory(oldCategoryName, newCategoryName,
					categoryDescription);

			return result;//this value is returned to the calling servlet
		}

	}

}
