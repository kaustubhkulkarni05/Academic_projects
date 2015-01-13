package client.jms.servlet;

import java.io.IOException;

import javax.jms.JMSException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import client.jms.core.Endpoints;
import client.jms.corejms.SignUpProducer;
import client.jms.entity.User;

/**
 * Servlet implementation class SignUpServlet
 */
public class SignUpServlet extends HttpServlet implements Endpoints {
	private static final long serialVersionUID = 1L;
       
    public SignUpServlet() {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setFirstName(request.getParameter("fname"));
        user.setLastName(request.getParameter("lname"));
        user.setState(request.getParameter("state"));
		user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));
        //service.signUp(user);
        SignUpProducer client = new SignUpProducer("SignUpQueue");
        try {
			String status = client.signUp(user);
			if (status.equals("Success"))
				request.getRequestDispatcher("login.jsp").forward(request, response);
			else
				response.getWriter().write("Sign Up failed. Please try again.");
		} catch (JMSException e) {
			response.getWriter().write("Sign Up failed. Please try again.");
		}finally {
			client.close();
		}
	}

}
