package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connection.ServiceProxy;
import DAO.CategoryAll;
import DAO.CategoryDisplay;
import DAO.CategoryName;

public class ShowAllCategory extends HttpServlet {

	private static final long serialVersionUID = 1L;
	 ServiceProxy proxy=new ServiceProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllCategory() {
        super();
        // TODO Auto-generated constructor stub
    }

//    protected void () {
//		
//	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		ResultSet resultSet;
		CategoryAll output = new CategoryAll();
		CategoryName adminOutput = new CategoryName();
		 try{			
			 	proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
			 	
			 	output = proxy.showAllCategory();
			 	
				HttpSession session = request.getSession();
					session.setAttribute("userSession", session);
					request.setAttribute("resultSet", output.getLoginTime());
					
					System.out.println("Description :"+output.getDescription());
					request.setAttribute("resultDescription", output.getDescription());
					request.setAttribute("resultReview", output.getReview());
					request.setAttribute("resultElement", output.getElement());
					request.setAttribute("resultRating", output.getRating());
					request.setAttribute("resultReviwer", output.getAllreviwerName());
					out.println("WELCOME to Simple Market Place :");//Displaying the message on the servlet itself.
				    RequestDispatcher view=request.getRequestDispatcher("restaurantReviews.jsp");
				    view.forward(request,response);
			
		 
		 }
		 catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	}


}
