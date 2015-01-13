package client.jms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jms.JMSException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import client.jms.core.Endpoints;
import client.jms.corejms.AdProducer;
import client.jms.entity.Advertisement;
import client.jms.entity.User;

/**
 * Servlet implementation class AdvertisementServlet
 */
public class AdvertisementServlet extends HttpServlet implements Endpoints {
	private static final long serialVersionUID = 1L;
    public AdvertisementServlet() {
        super();
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
         String task = request.getParameter("task");
         PrintWriter out = response.getWriter();
         
         if (task.equals("add")){
        	 String email = (String)request.getSession().getAttribute("user");
        	 Advertisement ad = new Advertisement();
        	 ad.setItemName(request.getParameter("name"));
        	 ad.setItemDescription(request.getParameter("description"));
        	 try {
        	   int quantity = Integer.parseInt(request.getParameter("quantity"));
        	   ad.setQuantity(quantity);
        	 }catch (NumberFormatException npe){
        		 out.write("Invalid quantity. Quantity should be numeric.");
        	 }
        	 
        	 try{
        		 float price = Float.parseFloat(request.getParameter("price"));
        		 ad.setPrice(price);
        	 } catch (NumberFormatException npe){
        		 out.write("Invalid price. Price should be numeric.");
        	 }
        	 ad.setSellerInfo(email);
        	 
        	 AdProducer producer = new AdProducer("AdTopic");
        	 try {
				producer.postAd(ad);
				request.getRequestDispatcher("home.jsp").forward(request, response);
			} catch (JMSException e) {
				e.printStackTrace();
			}
         }
	}

}
