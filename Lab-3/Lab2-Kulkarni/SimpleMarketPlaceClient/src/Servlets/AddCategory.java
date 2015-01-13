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
import DAO.CategoryName;

/**
 * Servlet implementation class SignUp
 */
public class AddCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ServiceProxy proxy=new ServiceProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCategory() {
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
//		String output ="" ;
//		CategoryName output = new CategoryName();
		CategoryName adminOutput = new CategoryName();
		CategoryDisplay output = new CategoryDisplay();
		
		 try{			
			 	String categoryName = request.getParameter("category_name");
			 	String categoryDescription = request.getParameter("category_desc");
			 	proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
			 	adminOutput = proxy.addCategory(categoryName, categoryDescription);
			 	System.out.println("Error mesaage :----->" + output.getErrorMessage());
			 	System.out.println("Category Name :----->" + output.getErrorMessage());
			 	System.out.println("Category description :----->" + output.getErrorMessage());
			 	
			 	if(output.getErrorMessage() == null){
				    RequestDispatcher view=request.getRequestDispatcher("categoryValidation.jsp");
				    view.forward(request,response);
			 	} else{
				HttpSession session = request.getSession();
//				System.out.println("in client output :" +output.getReviewerName());
//				if(resultSet.next()){
					session.setAttribute("userSession", session);
					adminOutput = proxy.displayCategory();

					session.setAttribute("userSession", session);
					request.setAttribute("resultSet", output.getLoginTime());
					request.setAttribute("resultCategory", adminOutput.getCategoryName());
					request.setAttribute("resultDescription", adminOutput.getCategoryDescription());
					out.println("WELCOME to Simple Market Place :");//Displaying the message on the servlet itself.
				    RequestDispatcher view=request.getRequestDispatcher("successComment.jsp");
				    view.forward(request,response);
			 	}
				
		 }
		 catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	}

}
