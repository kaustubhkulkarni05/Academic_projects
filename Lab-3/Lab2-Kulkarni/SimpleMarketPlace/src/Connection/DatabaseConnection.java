package Connection;

import java.sql.*;
import java.lang.*;

import DAO.CategoryAll;
import DAO.CategoryDisplay;
import DAO.CategoryName;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.mysql.jdbc.Driver;

public class DatabaseConnection {
	
	Connection con = null;
	static ResultSet rs;
    Statement stmt = null;
    ConnectionPool pool = ConnectionPool.getInstance();
    
    // own connection pooling
	DatabaseConnection(){		
		try {			
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				
				con = pool.getConnectionPool();
				stmt = con.createStatement();
				if(!con.isClosed())
					System.out.println("Successfully Connected!!!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
    
	
/*	DatabaseConnection(){		
		try {			
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yelp","root","root");
				stmt = con.createStatement();
				if(!con.isClosed())
					System.out.println("Successfully Connected!!!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}*/
    

	public String signUp(String fname, String lname,String uname, String pwd){
		String result = "";
		int rowcount;
		try {
			
			 java.util.Date date= new java.util.Date();
			 Timestamp t1 = new Timestamp(date.getTime());
			 System.out.println("Current time :- "+new Timestamp(date.getTime()));
			 
			String query = "Insert into user (first_name,last_name,email,password,login_time) values ('" + fname + "', '" + lname + "','" + uname + "','" + pwd + "','" + t1 + "')";
			System.out.println("SIGIN UP QUERY :---- >"+query );
			rowcount=stmt.executeUpdate(query);
			if(rowcount > 0){
				result="true";
				System.out.println("Insert Successful");
			}
			else{
				result="false: The data could not be inserted in the database.";
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.close(con);
		return result;
	}
	
	
	public CategoryDisplay addComments(String reviwer_name, String description,String rating ,String review, String Element){
		String result = "";
		int rowcount;
		CategoryDisplay cd = new CategoryDisplay();
		
		
		try {
			String query = "Insert into review (r_name, description, rating, review,Element) values ('" + reviwer_name + "', '" + description + "', "+ rating + ",'" + review + "','" + Element + "')";
			System.out.println("Add comment Query is :- " + query);
			rowcount=stmt.executeUpdate(query);
			if(rowcount > 0){
				result="true";
				 String outputDescription[] = new String [100];
				 String outputReview[] = new String [100];
				 String outputElement[] = new String [100];
				 String outputRating[] = new String [100];
				 
					
				try {
					//select  u1.*,r1.* from user  u1 left outer join review r1 on (r1.r_name = u1.first_name) where u1.email='"+req.param("inputUsername")+"'" + " order by login_time desc
					String query1 =  "select  u1.*,r1.* from user  u1 left outer join review r1 on (r1.r_name = u1.first_name) where u1.first_name= '" + reviwer_name + "'" + " order by login_time desc";
					rs=stmt.executeQuery(query1);
					if(rs.next()){
//						result="true";
						int i = 0;
						System.out.println("After signin Successful");
						
						System.out.println("Details:" + rs.getString("r_name"));
						
					 	
//					 	    String em = rs.getString("email");
//					 	   output = em.split("\n");
					 		cd.setReviewerName(rs.getString("r_name"));
					 		cd.setLoginTime(rs.getString("login_time"));
					 	   
					 		do {
					 	     
					 	    	outputDescription[i]= rs.getString("description");
					 	    	outputReview[i]=rs.getString("review");
					 	    	outputElement[i]=rs.getString("Element");
					 	    	outputRating[i]=rs.getString("rating");
					 	    	System.out.println("outputDescription:" + outputDescription[i]);
					 	    	System.out.println("outputReview:" + outputReview[i]);
					 	    	System.out.println("outputElement:" + outputElement[i]);
					 	    	i++;
					 	    	
					 		}  while (rs.next()); 
					 
					 	    
					 	    cd.setDescription(outputDescription);
					 	    cd.setReview(outputReview);
					 	    cd.setElement(outputElement);
					 	    cd.setRating(outputRating);
					 	
						
						
					}
					else{
						System.out.println("false: There is no data.");
					}	
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				System.out.println("Insert Successful");
			}
			else{
				result="false: The data could not be inserted in the database.";
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.close(con);
		return cd;
	}
	
	
	
	public CategoryDisplay updateComments(String reviwer_name, String description,String rating ,String review, String Element){
		String result = "";
		int rowcount;
		CategoryDisplay cd = new CategoryDisplay();
		try {
//			String query = "Insert into review (r_name, description, rating, review,Element) values ('" + reviwer_name + "', '" + description + "', "+ rating + ",'" + review + "','" + Element + "')";
			String query = "update review set description = '"  +  description  +  "'" + ", rating = " + rating + ", review = '" + review +"'" +"where r_name = '"+ reviwer_name +"'" + "and Element = '"+ Element +"'"; 
					// I am loving it" , rating = 7, review="cool" , Element = "CCD" where r_name="Abhishek";;
			System.out.println("Add comment Query is :- " + query);
			rowcount=stmt.executeUpdate(query);
			if(rowcount > 0){
				result="true";
				 String outputDescription[] = new String [100];
				 String outputReview[] = new String [100];
				 String outputElement[] = new String [100];
				 String outputRating[] = new String [100];
				 
					
				try {
					//select  u1.*,r1.* from user  u1 left outer join review r1 on (r1.r_name = u1.first_name) where u1.email='"+req.param("inputUsername")+"'" + " order by login_time desc
					String query1 =  "select  u1.*,r1.* from user  u1 left outer join review r1 on (r1.r_name = u1.first_name) where u1.first_name= '" + reviwer_name + "'" + " order by login_time desc";
					rs=stmt.executeQuery(query1);
					if(rs.next()){
//						result="true";
						int i = 0;
						System.out.println("After signin Successful");
						
						System.out.println("Details:" + rs.getString("r_name"));
						
					 	
//					 	    String em = rs.getString("email");
//					 	   output = em.split("\n");
					 		cd.setReviewerName(rs.getString("r_name"));
					 		cd.setLoginTime(rs.getString("login_time"));
					 	   
					 		do {
					 	     
					 	    	outputDescription[i]= rs.getString("description");
					 	    	outputReview[i]=rs.getString("review");
					 	    	outputElement[i]=rs.getString("Element");
					 	    	outputRating[i]=rs.getString("rating");
					 	    	System.out.println("outputDescription:" + outputDescription[i]);
					 	    	System.out.println("outputReview:" + outputReview[i]);
					 	    	System.out.println("outputElement:" + outputElement[i]);
					 	    	i++;
					 	    	
					 		}  while (rs.next()); 
					 
					 	    
					 	    cd.setDescription(outputDescription);
					 	    cd.setReview(outputReview);
					 	    cd.setElement(outputElement);
					 	    cd.setRating(outputRating);
					 	
						
						
					}
					else{
						System.out.println("false: There is no data.");
					}	
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				System.out.println("Insert Successful");
			}
			else{
				result="false: The data could not be inserted in the database.";
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.close(con);
		return cd;
	}
	
	
	
	
	public CategoryDisplay deleteComments(String reviwer_name, String Element){
		String result = "";
		int rowcount;
		CategoryDisplay cd = new CategoryDisplay();
		try {
//			String query = "Insert into review (r_name, description, rating, review,Element) values ('" + reviwer_name + "', '" + description + "', "+ rating + ",'" + review + "','" + Element + "')";
			String query = "DELETE FROM review WHERE r_name = '" + reviwer_name + "'" +"and Element = '" + Element + "'";
			System.out.println("Delete comment Query is :- " + query);
			rowcount=stmt.executeUpdate(query);
			if(rowcount > 0){
				result="true";
				 String outputDescription[] = new String [100];
				 String outputReview[] = new String [100];
				 String outputElement[] = new String [100];
				 String outputRating[] = new String [100];
				 
					
				try {
					//select  u1.*,r1.* from user  u1 left outer join review r1 on (r1.r_name = u1.first_name) where u1.email='"+req.param("inputUsername")+"'" + " order by login_time desc
					String query1 =  "select  u1.*,r1.* from user  u1 left outer join review r1 on (r1.r_name = u1.first_name) where u1.first_name= '" + reviwer_name + "'" + " order by login_time desc";
					rs=stmt.executeQuery(query1);
					if(rs.next()){
//						result="true";
						int i = 0;
						System.out.println("After delete Query");
						
					 		cd.setReviewerName(rs.getString("r_name"));
					 		cd.setLoginTime(rs.getString("login_time"));
					 	   
					 		do {
					 	     
					 	    	outputDescription[i]= rs.getString("description");
					 	    	outputReview[i]=rs.getString("review");
					 	    	outputElement[i]=rs.getString("Element");
					 	    	outputRating[i]=rs.getString("rating");
					 	    	System.out.println("outputDescription:" + outputDescription[i]);
					 	    	System.out.println("outputReview:" + outputReview[i]);
					 	    	System.out.println("outputElement:" + outputElement[i]);
					 	    	i++;
					 	    	
					 		}  while (rs.next()); 
					 
					 	    
					 	    cd.setDescription(outputDescription);
					 	    cd.setReview(outputReview);
					 	    cd.setElement(outputElement);
					 	    cd.setRating(outputRating);
					 	
						
						
					}
					else{
						System.out.println("false: There is no data.");
					}	
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				System.out.println("Insert Successful");
			}
			else{
				result="false: The data could not be inserted in the database.";
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.close(con);
		return cd;
	}
	
	
	
	
	public CategoryName homePage(){
		String result = "";
		int rowcount;
		
		CategoryName cd = new CategoryName();
		
		 String outputDescription[] = new String [10];
			
		try {
			String query =  "select category_name from category";
			rs=stmt.executeQuery(query);
			if(rs.next()){
//				result="true";
				int i = 0;
				System.out.println("Inside Home page");
				
			 	   
			 		do {
			 	     
			 	    	outputDescription[i]= rs.getString("category_name");
			 	    	System.out.println("Category Names are :" + outputDescription[i]);
			 	    	i++;
			 	    	
			 		}  while (rs.next()); 
			 
			 	    
			 	    cd.setCategoryName(outputDescription);
			}
			else{
				System.out.println("false: There is no data.");
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.close(con);
		return cd;
}
	
	public void updateTime(String uname, String pwd){

		 java.util.Date date= new java.util.Date();
		 Timestamp t1 = new Timestamp(date.getTime());
		 System.out.println("Current time :- "+new Timestamp(date.getTime()));
			
		try {
			//select  u1.*,r1.* from user  u1 left outer join review r1 on (r1.r_name = u1.first_name) where u1.email='"+req.param("inputUsername")+"'" + " order by login_time desc
			String query1 ="update yelp.user set login_time = '" + t1 + "'" + " where email = '" + uname +"'";
			stmt.executeUpdate(query1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	public CategoryDisplay signIn(String uname, String pwd){
		String result = "";
		int rowcount;
		
		CategoryDisplay cd = new CategoryDisplay();
		
		 String outputDescription[] = new String [10];
		 String outputReview[] = new String [10];
		 String outputElement[] = new String [10];
		 String outputRating[] = new String [10];

			
		try {
			//select  u1.*,r1.* from user  u1 left outer join review r1 on (r1.r_name = u1.first_name) where u1.email='"+req.param("inputUsername")+"'" + " order by login_time desc

			String query =  "select  u1.*,r1.* from user  u1 left outer join review r1 on (r1.r_name = u1.first_name) where u1.email= '" + uname + "'" + "and u1.password = '" + pwd + "'" + " order by login_time desc";
			rs=stmt.executeQuery(query);
			if(rs.next()){
//				result="true";
				int i = 0;
				System.out.println("After signin Successful");
				
				System.out.println("Details:" + rs.getString("r_name"));
				
			 		cd.setReviewerName(rs.getString("r_name"));
			 		cd.setLoginTime(rs.getString("login_time"));
			 	   
			 		do {
			 	     
			 	    	outputDescription[i]= rs.getString("description");
			 	    	outputReview[i]=rs.getString("review");
			 	    	outputElement[i]=rs.getString("Element");
			 	    	outputRating[i]=rs.getString("rating");
			 	    	System.out.println("outputDescription:" + outputDescription[i]);
			 	    	System.out.println("outputReview:" + outputReview[i]);
			 	    	System.out.println("outputElement:" + outputElement[i]);
			 	    	i++;
			 	    	
			 		}  while (rs.next()); 
			 
			 	    
			 	    cd.setDescription(outputDescription);
			 	    cd.setReview(outputReview);
			 	    cd.setElement(outputElement);
			 	    cd.setRating(outputRating);
			 	
				
				
			}
			else{
				System.out.println("false: There is no data.");
				cd.setErrorMessage("Invalid user");
				
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.close(con);
		
		return cd;
	}
	
	
	public CategoryAll showAllCategory(){
		String result = "";
		int rowcount;
		
		CategoryAll cd = new CategoryAll();
		
		 String outputDescription[] = new String [10];
		 String outputReview[] = new String [10];
		 String outputElement[] = new String [10];
		 String outputRating[] = new String [10];
		 String outputName[] = new String [10];
		 
			
		try {
			//select  u1.*,r1.* from user  u1 left outer join review r1 on (r1.r_name = u1.first_name) where u1.email='"+req.param("inputUsername")+"'" + " order by login_time desc
			String query =  "select * from review";
			rs=stmt.executeQuery(query);
			if(rs.next()){
//				result="true";
				int i = 0;
				System.out.println("After signin Successful");
				
				System.out.println("Details:" + rs.getString("r_name"));
				
			 	
//			 	    String em = rs.getString("email");
//			 	   output = em.split("\n");
			 		//cd.setReviewerName(rs.getString("r_name"));
//			 		cd.setLoginTime(rs.getString("login_time"));
			 	   
			 		do {
			 	     
			 	    	outputDescription[i]= rs.getString("description");
			 	    	outputReview[i]=rs.getString("review");
			 	    	outputElement[i]=rs.getString("Element");
			 	    	outputRating[i]=rs.getString("rating");
			 	    	outputName[i]=rs.getString("r_name");
			 	    	System.out.println("outputDescription:" + outputDescription[i]);
			 	    	System.out.println("outputReview:" + outputReview[i]);
			 	    	System.out.println("outputElement:" + outputElement[i]);
			 	    	i++;
			 	    	
			 		}  while (rs.next()); 
			 
			 	    
			 	    cd.setDescription(outputDescription);
			 	    cd.setReview(outputReview);
			 	    cd.setElement(outputElement);
			 	    cd.setRating(outputRating);
			 	    cd.setAllreviwerName(outputName);
			 	
				
				
			}
			else{
				System.out.println("false: There is no data.");
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.close(con);
		return cd;
	}
	
	
	public CategoryName displayCategory(){
		String result = "";
		int rowcount;
		
		CategoryName cd = new CategoryName();
		
		 String categoryName[] = new String [100];
		 String categoryDescription[] = new String [100];
			
		try {
			String query =  "select category_name,category_description from category";
			rs=stmt.executeQuery(query);
			if(rs.next()){
//				result="true";
				int i = 0;
				System.out.println("Inside display category page");
			 		do {
			 			categoryName[i]= rs.getString("category_name");
			 			categoryDescription[i]= rs.getString("category_description");
			 	    	System.out.println("Category Names are :" + categoryName[i]);
			 	    	i++;
			 	    	
			 		}  while (rs.next()); 
			 	    cd.setCategoryName(categoryName);
			 	   cd.setCategoryDescription(categoryDescription);
			}
			else{
				System.out.println("false: There is no data.");
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.close(con);
		return cd;
}

	public CategoryName addCategory(String categoryName, String categoryDescription){
		String result = "";
		CategoryName cd = new CategoryName();
		
		 String categoryNameLocal[] = new String [100];
		 String categoryDescriptionLocal[] = new String [100];
		int rowcount;
		System.out.println("Server side Category Name:" +categoryName);
		
		
		try {
			String query = "Insert into category (category_name, category_description) values ('" + categoryName + "', '" + categoryDescription + "')";
			rowcount=stmt.executeUpdate(query);
			if(rowcount > 0){
				result="true";
				System.out.println("Insert category Successful");
				
				String query1 =  "select category_name,category_description from category";
				rs=stmt.executeQuery(query1);
				if(rs.next()){
//					result="true";
					int i = 0;
					System.out.println("Inside display category page");
				 		do {
				 			categoryNameLocal[i]= rs.getString("category_name");
				 			categoryDescriptionLocal[i]= rs.getString("category_description");
				 	    	i++;
				 	    	
				 		}  while (rs.next()); 
				 	    cd.setCategoryName(categoryNameLocal);
				 	   cd.setCategoryDescription(categoryDescriptionLocal);
				}
				else{
					System.out.println("false: There is no data.");
				}	
				
				
			}
			else{
				result="false: The data could not be inserted in the database.";
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.close(con);
		
		return cd;
	}
	
	
	public CategoryName deleteCategory(String categoryName){
		String result = "";
		CategoryName cd = new CategoryName();
		
		 String categoryNameLocal[] = new String [100];
		 String categoryDescriptionLocal[] = new String [100];
		int rowcount;
		try {
			String query = "DELETE FROM category WHERE category_name = '" + categoryName + "'";
			rowcount=stmt.executeUpdate(query);
			if(rowcount > 0){
				result="true";
				System.out.println("Insert category Successful");
				
				String query1 =  "select category_name,category_description from category";
				rs=stmt.executeQuery(query1);
				if(rs.next()){
//					result="true";
					int i = 0;
					System.out.println("Inside display category page");
				 		do {
				 			categoryNameLocal[i]= rs.getString("category_name");
				 			categoryDescriptionLocal[i]= rs.getString("category_description");
				 	    	i++;
				 	    	
				 		}  while (rs.next()); 
				 	    cd.setCategoryName(categoryNameLocal);
				 	   cd.setCategoryDescription(categoryDescriptionLocal);
				}
				else{
					System.out.println("false: There is no data.");
				}	
				
				
			}
			else{
				result="false: The data could not be inserted in the database.";
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.close(con);
		return cd;
	}
	
	public CategoryName updateCategory(String oldCategoryName,String newCategoryName, String categoryDescription){
		String result = "";
		CategoryName cd = new CategoryName();
		
		 String categoryNameLocal[] = new String [100];
		 String categoryDescriptionLocal[] = new String [100];
		int rowcount;
		try {
			//UPDATE category set ? WHERE category_name = ?'
			//"update review set description = '"  +  description  +  "'" + ", rating = " + rating + ", review = '" + review +"'" +"where r_name = '"+ reviwer_name +"'" + "and Element = '"+ Element +"'";
			String query = "update category set category_name = '"  +  newCategoryName  +  "'" + ", category_description = '" + categoryDescription +"'" +"where category_name = '"+ oldCategoryName +"'";
			rowcount=stmt.executeUpdate(query);
			if(rowcount > 0){
				result="true";
				System.out.println("Update category Successful");
				
				String query1 =  "select category_name,category_description from category";
				rs=stmt.executeQuery(query1);
				if(rs.next()){
//					result="true";
					int i = 0;
					System.out.println("Inside display category page");
				 		do {
				 			categoryNameLocal[i]= rs.getString("category_name");
				 			categoryDescriptionLocal[i]= rs.getString("category_description");
				 	    	i++;
				 	    	
				 		}  while (rs.next()); 
				 	    cd.setCategoryName(categoryNameLocal);
				 	   cd.setCategoryDescription(categoryDescriptionLocal);
				}
				else{
					System.out.println("false: There is no data.");
				}	
				
				
			}
			else{
				result="false: The data could not be inserted in the database.";
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.close(con);
		return cd;
	}

}
