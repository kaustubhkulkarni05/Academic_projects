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

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ServiceProxy proxy=new ServiceProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
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
		 try{			
			 	String firstName = request.getParameter("firstName");
			 	String lastName = request.getParameter("lastName");
			 	String inputUsername = request.getParameter("inputUsername");
			 	String inputPassword = request.getParameter("inputPassword");
			 	proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
				qdone = proxy.signUp(firstName,lastName,inputUsername,inputPassword);
				HttpSession session = request.getSession();
			 	if(qdone.equalsIgnoreCase("Invalid user")){
				    RequestDispatcher view=request.getRequestDispatcher("singUpValidation.jsp");
				    view.forward(request,response);
			 	} else{
				
				if(qdone.substring(0,4).equals("true")){
					session.setAttribute("userSession", session);
					System.out.println("inside sinup");
					out.println("WELCOME to Simple Market Place :"+ firstName);//Displaying the message on the servlet itself.
				    RequestDispatcher view=request.getRequestDispatcher("welcomeSignUp.jsp");
				    view.forward(request,response);
//					out.println("\n <a href=\"SignUp.jsp\"><br>Go back to SignUp again</a>");
				}
				else{
					out.println(qdone.substring(6));
					out.println("\n <a href=\"SignUp.jsp\"><br>Go back to SignUp again</a>");
				}
			 }
		 }
		 catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	}

}
