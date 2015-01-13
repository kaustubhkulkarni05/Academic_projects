package client.jms.corejms;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MarketPlaceProducer {
	protected Connection connection;
	protected Session session;
	protected Destination destination;
	protected String destinationName;
	
	public MarketPlaceProducer(String destinationName){
		this.destinationName = destinationName;
		init();
	}
	
	private final void init(){
		try
		{
			Properties properties = new Properties();
			properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
			properties.put(Context.URL_PKG_PREFIXES, "org.jnp.interfaces");
			properties.put(Context.PROVIDER_URL, "localhost");

			InitialContext jndi = new InitialContext(properties);
			ConnectionFactory conFactory = (ConnectionFactory)jndi.lookup("XAConnectionFactory");
			connection = conFactory.createConnection();
			session = connection.createSession( false, Session.AUTO_ACKNOWLEDGE );
			destination = (Destination)jndi.lookup(destinationName);
			connection.start();
		}
		catch(NamingException NE)
		{
			System.out.println("Naming Exception: "+NE);
		}
		catch(JMSException JMSE)
		{
			System.out.println("JMS Exception: "+JMSE);
			JMSE.printStackTrace();
		}
	}
	
	public void close(){
		try {
			session.close();
			connection.close();
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
