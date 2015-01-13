package server.jms.consumer;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import server.jms.connection.DatabaseConnection;
import server.jms.dao.UserDao;

public abstract class MarketPlaceConsumer implements MessageListener {

	protected static final String SUCCESS = "Success";
	protected static final String FAILURE = "Failure";
	
	private Connection connection;
	private Session session;
	private Queue queue;
	protected UserDao userDao;
	protected DatabaseConnection signupDao;
	protected DatabaseConnection addCategoryDao;
	protected DatabaseConnection deleteCategoryDao;
	protected DatabaseConnection updateCategoryDao;
	
	protected String queueName;
	
	public MarketPlaceConsumer(String queueName){
		this.queueName = queueName;
		userDao = new UserDao();
		init();
	}
	
	public abstract void onMessage(Message msg); 	
	
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

			registerQueue(jndi);
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

	private void registerQueue(InitialContext jndi) throws JMSException, NamingException{
		try	{
			queue = (Queue)jndi.lookup(queueName);
		}
		catch(NamingException NE1){
			System.out.println("NamingException: " + NE1 + " : Continuing anyway...");
		}

		if( null == queue )	{
			queue = session.createQueue(queueName);
			jndi.bind(queueName, queue);
		}

		MessageConsumer consumer = session.createConsumer(queue);
		consumer.setMessageListener(this);
	}
	
	protected void sendReply(Message request, String message)
	{
		try	{
			MessageProducer MP = session.createProducer(null);
			Destination reply = request.getJMSReplyTo();
			TextMessage TM = session.createTextMessage();
			TM.setText(message);
			MP.send(reply, TM);
		} catch(JMSException JMSE){
			System.out.println("JMS Exception: "+JMSE);
		}
	}
}
