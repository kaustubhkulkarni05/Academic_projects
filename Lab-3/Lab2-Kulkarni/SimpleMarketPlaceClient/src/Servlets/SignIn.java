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
import DAO.CategoryDisplay;
import DAO.CategoryName;

public class SignIn extends HttpServlet {

	private static final long serialVersionUID = 1L;
	 ServiceProxy proxy=new ServiceProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignIn() {
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
		CategoryDisplay output = new CategoryDisplay();
		CategoryName adminOutput = new CategoryName();
		 try{			
			 	String inputUsername = request.getParameter("inputUsername");
			 	String inputPassword = request.getParameter("inputPassword");
			 	proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
			 	
			 	output = proxy.signIn(inputUsername, inputPassword);
			 	System.out.println("validation client: "+output.getErrorMessage());
			 	if(output.getErrorMessage() != null){
				    RequestDispatcher view=request.getRequestDispatcher("userValidation.jsp");
				    view.forward(request,response);
			 	} else{
		 	
			 	
			 	System.out.println("in client output :" +output.getReviewerName());
			 	
				HttpSession session = request.getSession();
				
				if (inputUsername.equalsIgnoreCase("admin@gmail.com")){
					
					adminOutput = proxy.displayCategory();

					session.setAttribute("userSession", session);
					request.setAttribute("resultSet", output.getLoginTime());
					request.setAttribute("resultCategory", adminOutput.getCategoryName());
					request.setAttribute("resultDescription", adminOutput.getCategoryDescription());
					out.println("WELCOME to Simple Market Place :");//Displaying the message on the servlet itself.
				    RequestDispatcher view=request.getRequestDispatcher("successComment.jsp");
				    view.forward(request,response);
					
				} else{
				
				
					session.setAttribute("userSession", session);
					request.setAttribute("resultSet", output.getLoginTime());
					
					
					System.out.println("Description :"+output.getDescription());
					request.setAttribute("resultDescription", output.getDescription());
					request.setAttribute("resultReview", output.getReview());
					request.setAttribute("resultElement", output.getElement());
					request.setAttribute("resultRating", output.getRating());
					request.setAttribute("resultReviwer", output.getReviewerName());
					out.println("WELCOME to Simple Market Place :");//Displaying the message on the servlet itself.
				    RequestDispatcher view=request.getRequestDispatcher("successUser.jsp");
				    view.forward(request,response);
				}
			 	}
		 
		 }
		 catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	}


}
