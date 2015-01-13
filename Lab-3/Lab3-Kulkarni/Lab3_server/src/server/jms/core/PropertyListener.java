package server.jms.core;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//import edu.sjsu.cmpe273.marketplace.jms.MarketPlaceAdConsumer;





import server.jms.consumer.SignInConsumer;
import server.jms.consumer.SignUpConsumer;
import server.jms.consumer.addCategory;
import server.jms.consumer.deleteCategory;
import server.jms.consumer.updateCategory;


public class PropertyListener implements ServletContextListener {

	private String appProp = "app.properties";
	
	public void contextDestroyed(ServletContextEvent contextEvent) {
	}

	public void contextInitialized(ServletContextEvent contextEvent) {
		ServletContext context = contextEvent.getServletContext();
		InputStream is = context.getResourceAsStream(appProp);
	    ApplicationProperties.load(is);
	    try {
			is.close();
		} catch (IOException e) {
			System.err.println("Listener initialization failed. Cannot publish webservice.");
		}
	    new SignInConsumer("SignInQueue");
	    new SignUpConsumer("SignUpQueue");
	    new addCategory("addTopic");
	    new deleteCategory("deleteTopic");
	    new updateCategory("updateTopic");
	}

}
