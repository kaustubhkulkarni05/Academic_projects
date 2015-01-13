package client.jms.corejms;

import java.util.ArrayList;

import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.TemporaryQueue;
import javax.jms.TextMessage;

import client.jms.entity.Advertisement;

public final class AdProducer extends MarketPlaceProducer {

	public AdProducer(String topicName){
		super(topicName);
	}

	public String postAd(Advertisement ad) throws JMSException{
		MessageProducer mp = session.createProducer(destination);
		ObjectMessage om = session.createObjectMessage();
		om.setStringProperty("msg","postAd");
		TemporaryQueue tq = session.createTemporaryQueue();
		MessageConsumer mc = session.createConsumer(tq);
		om.setObject(ad);
		om.setJMSReplyTo(tq);
		mp.send(om);

		TextMessage tm = (TextMessage)mc.receive();
		return tm.getText();
	}

	public ArrayList<Advertisement> viewAds(String userEmail) throws JMSException{
		MessageProducer mp = session.createProducer(destination);
		TextMessage om = session.createTextMessage();
		om.setStringProperty("msg","viewAd");
		TemporaryQueue tq = session.createTemporaryQueue();
		MessageConsumer mc = session.createConsumer(tq);
		om.setText(userEmail);
		om.setJMSReplyTo(tq);
		mp.send(om);

		ObjectMessage tm = (ObjectMessage)mc.receive();
		return (ArrayList<Advertisement>) tm.getObject();
	}
	
}
