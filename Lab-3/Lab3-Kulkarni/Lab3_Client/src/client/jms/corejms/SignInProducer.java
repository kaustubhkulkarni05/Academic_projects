package client.jms.corejms;

import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.TemporaryQueue;
import javax.jms.TextMessage;

public final class SignInProducer extends MarketPlaceProducer {

	public SignInProducer(String queueName){
		super(queueName);
	}

	public String signIn(String email, String password) throws JMSException{
		MessageProducer mp = session.createProducer(destination);
		TextMessage om = session.createTextMessage();
		om.setStringProperty("msg", "signIn");
		TemporaryQueue tq = session.createTemporaryQueue();
		MessageConsumer mc = session.createConsumer(tq);
		om.setText(email + ";" + password);
		System.out.println("email is : "+email);
		System.out.println("password is : "+password);
		om.setJMSReplyTo(tq);
		mp.send(om);

		TextMessage tm = (TextMessage)mc.receive();
		return tm.getText();
	}

	public void signOut(String email) throws JMSException{
		MessageProducer mp = session.createProducer(destination);
		TextMessage om = session.createTextMessage();
		om.setStringProperty("msg", "signOut");
		om.setText(email);
		mp.send(om);
	}
}
