package client.jms.servlet;

import java.io.IOException;

import javax.jms.JMSException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import client.jms.core.Endpoints;
import client.jms.corejms.SignInProducer;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet implements Endpoints {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() throws ServletException {
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String task = request.getParameter("a");

		if (task != null && task.equals("c")){
			HttpSession session = request.getSession();
			String userEmail = (String)session.getAttribute("user");
			SignInProducer client = new SignInProducer("SignInQueue");
			try {
				client.signOut(userEmail);
				session.invalidate();
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} catch (JMSException e) {
				response.getWriter().write("Logout failed.");
			}
			finally {
				client.close();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		SignInProducer client = new SignInProducer("SignInQueue");
		try {
			String status  = client.signIn(email, password);
			if (status.startsWith("SUCCESS")) {
				HttpSession session = request.getSession();
				session.setAttribute("user", email);
				session.setAttribute("lastLogin", status.split(":")[1]);
				request.getRequestDispatcher("home.jsp").forward(request, response);
			}
			else {
				response.getWriter().write("Sign In failed. Please try again.");
			}
		} catch (JMSException e) {
			response.getWriter().write("Sign In failed. Please try again.");
		}
		finally {
			client.close();
		}
	}

}
