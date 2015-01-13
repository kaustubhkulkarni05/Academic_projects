package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connection.ServiceProxy;
import DAO.CategoryName;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ServiceProxy proxy=new ServiceProxy();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomePage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		ResultSet resultSet;
//		String output [] = null;
//		String sendOutput [] = null;
//		 try{			
////			 	String firstName = request.getParameter("firstName");
////			 	String lastName = request.getParameter("lastName");
////			 	String inputUsername = request.getParameter("inputUsername");
////			 	String inputPassword = request.getParameter("inputPassword");
//			 	proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
//			 	output =  proxy.homePage();
//			 	
//			 	
////			 	while (resultSet.next()) {
////			 	    String em = resultSet.getString("category_name");
////			 	   output = em.split("\n");
////			 	    for (int i =0; i < output.length; i++){
////			 	        System.out.println(output[i]);
////			 	        
////			 	    }
////			 	}
//			 	
//			 	
//				HttpSession session = request.getSession();
//				if(output.length > 0){
//					session.setAttribute("userSession", session);
//					request.setAttribute("output", output);
//					System.out.println("inside client home page..");
//					out.println("WELCOME to Simple Market Place :");//Displaying the message on the servlet itself.
//				    RequestDispatcher view=request.getRequestDispatcher("home.jsp");
//				    view.forward(request,response);
////					out.println("\n <a href=\"SignUp.jsp\"><br>Go back to SignUp again</a>");
//				}
//				else{
////					out.println(qdone.substring(6));
//					out.println("\n <a href=\"SignUp.jsp\"><br>Go back to SignUp again</a>");
//				}
//		 }
//		 catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		ResultSet resultSet;
		CategoryName output = new CategoryName();
		 try{			
//			 	String firstName = request.getParameter("firstName");
//			 	String lastName = request.getParameter("lastName");
//			 	String inputUsername = request.getParameter("inputUsername");
//			 	String inputPassword = request.getParameter("inputPassword");
			 	proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
//			 	resultSet = (ResultSet) proxy.afterSignIn(inputUsername, inputPassword);
			 	
			 	output = proxy.homePage();
			 	System.out.println("in client output :" +output.getCategoryName());
			 	
			 	
//			 	while (resultSet.next()) {
//			 	    String em = resultSet.getString("category_name");
//			 	   output = em.split("\n");
//			 	    for (int i =0; i < output.length; i++){
//			 	        System.out.println(output[i]);
//			 	    }
//			 	}
			 	
			 	
				HttpSession session = request.getSession();
//				if(resultSet.next()){
					session.setAttribute("userSession", session);
//					System.out.println("user :-- " + output[0]);
//					request.setAttribute("resultSet", output.getLoginTime());
					
//					ArrayList<String> description = new ArrayList<String>();
					
					System.out.println("Description :"+output.getCategoryName());
					request.setAttribute("categoryNames", output.getCategoryName());
//					request.setAttribute("resultReview", output.getReview());
//					request.setAttribute("resultElement", output.getElement());
//					request.setAttribute("resultReviwer", output.getReviewerName());
//					out.println("WELCOME to Simple Market Place :");//Displaying the message on the servlet itself.
				    RequestDispatcher view=request.getRequestDispatcher("successUser.jsp");
				    view.forward(request,response);
//					out.println("\n <a href=\"SignUp.jsp\"><br>Go back to SignUp again</a>");
//				}
//				else{
//					out.println(qdone.substring(6));
//					out.println("\n <a href=\"SignUp.jsp\"><br>Go back to SignUp again</a>");
//				}
		 }
		 catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	}

}
