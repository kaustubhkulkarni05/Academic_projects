package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connection.ServiceProxy;
import DAO.CategoryDisplay;

/**
 * Servlet implementation class SignUp
 */
public class UpdateComment extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ServiceProxy proxy=new ServiceProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateComment() {
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
		String qdone;		
		CategoryDisplay output = new CategoryDisplay();
		 try{			
			 	String reviwer_name = request.getParameter("review_name");
			 	String element = request.getParameter("rest_name");
			 	String description = request.getParameter("description1");
			 	String review = request.getParameter("review1");
			 	String rating = request.getParameter("rating1");
			 	proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
			 	output = proxy.updateComments(reviwer_name, description, rating, review, element);
			 	
			 	if(output.getReviewerName() == null){
				    RequestDispatcher view=request.getRequestDispatcher("updateCommentValidation.jsp");
				    view.forward(request,response);
			 	} else{
				HttpSession session = request.getSession();
				System.out.println("in client output :" +output.getReviewerName());
//				if(resultSet.next()){
					session.setAttribute("userSession", session);
//					System.out.println("user :-- " + output[0]);
					request.setAttribute("resultSet", output.getLoginTime());
					
//					ArrayList<String> description = new ArrayList<String>();
					
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
		 catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	}

}
