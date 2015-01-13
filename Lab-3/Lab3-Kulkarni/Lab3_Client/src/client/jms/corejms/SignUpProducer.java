package client.jms.corejms;

import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.TemporaryQueue;
import javax.jms.TextMessage;

import client.jms.entity.User;

public final class SignUpProducer extends MarketPlaceProducer {

	public SignUpProducer(String queueName){
		super(queueName);
	}

	public String signUp(User user) throws JMSException{
		MessageProducer mp = session.createProducer(destination);
		ObjectMessage om = session.createObjectMessage();
		TemporaryQueue tq = session.createTemporaryQueue();
		MessageConsumer mc = session.createConsumer(tq);
		om.setObject(user);
		om.setJMSReplyTo(tq);
		mp.send(om);

		TextMessage tm = (TextMessage)mc.receive();
		return tm.getText();
	}

}
