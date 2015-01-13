package server.jms.dao;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import server.jms.entity.User;

public class UserDao {
	static ResultSet rs;
    Statement stmt = null;
	Connection con = null;
	public UserDao(){		
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
}


	public String signIn(String uname, String pwd){
		String result = "";
		int rowcount;

		//CategoryDisplay cd = new CategoryDisplay();
		

			
		try {
			//select  u1.*,r1.* from user  u1 left outer join review r1 on (r1.r_name = u1.first_name) where u1.email='"+req.param("inputUsername")+"'" + " order by login_time desc

			String query =  "select  u1.*,r1.* from user  u1 left outer join review r1 on (r1.r_name = u1.first_name) where u1.email= '" + uname + "'" + "and u1.password = '" + pwd + "'" + " order by login_time desc";
			rs=stmt.executeQuery(query);
			if(rs.next()){
				result="SUCCESS";
			
				System.out.println("After signin Successful");
				
			

				
				
			}
			else{
				System.out.println("false: There is no data.");
				result="FAILURE";
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		pool.close(con);
		
		return result;
	}
	



}