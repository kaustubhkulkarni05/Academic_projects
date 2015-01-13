package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DefaultNamespace.CalculatorProxy;

public class calculator extends HttpServlet {

	private static final long serialVersionUID = 1L;
	CalculatorProxy proxy=new CalculatorProxy();  
   /**
    * @see HttpServlet#HttpServlet()
    */
	
	public calculator(){
		super();
	}

//   protected void () {
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
		 try{			
			    String num1S = request.getParameter("number1");
			    String num2S = request.getParameter("number2");
			    String operation = request.getParameter("submit");
				proxy.setEndpoint("http://localhost:8080/Lab2-Calculator/services/Calculator");

				String validInput;
				validInput = proxy.checkInput(num1S, num2S,operation);
				if(validInput.equals("valid input")){
					Integer num1 = Integer.parseInt(num1S);
					Integer num2 = Integer.parseInt(num2S);
				if(operation.equals("ADD")){
					Integer addition;
					addition = proxy.add(num1,num2);
					request.setAttribute("total", addition); // It'll be available as ${sum}.
					request.getRequestDispatcher("calculator.jsp").forward(request, response); // Redisplay JSP.
					} 
				
				if(operation.equals("SUBTRACT")){
					Integer subtraction;
					subtraction =proxy.sub(num1, num2);
					request.setAttribute("total", subtraction);
					request.getRequestDispatcher("calculator.jsp").forward(request, response); // Redisplay JSP.
				}
				
				if(operation.equals("MULTIPLY")){
					Integer multiplication;
					multiplication =proxy.mul(num1, num2);
					request.setAttribute("total", multiplication); // It'll be available as ${sum}.
					request.getRequestDispatcher("calculator.jsp").forward(request, response); // Redisplay JSP.
				}
				
				if(operation.equals("DIVIDE")){
					Integer division;
					division =proxy.div(num1, num2);
					request.setAttribute("total", division); // It'll be available as ${sum}.
					request.getRequestDispatcher("calculator.jsp").forward(request, response); // Redisplay JSP.
				  }
				} else {
						request.setAttribute("total", validInput); // It'll be available as ${sum}.
						request.getRequestDispatcher("calculator.jsp").forward(request, response); // Redisplay JSP.
				}
			    
			     // It'll be available as ${sum}.
//			    out.println("WELCOME to Simple Market Place :"+ user);
			    
		 }
		 catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	}
	

}
