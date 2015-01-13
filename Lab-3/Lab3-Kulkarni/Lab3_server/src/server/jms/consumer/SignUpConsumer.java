package server.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;



import server.jms.entity.User;

public class SignUpConsumer extends MarketPlaceConsumer {

	public SignUpConsumer(String queueName){
		super(queueName);
	}

	public void onMessage(Message signUp) {
		if (signUp != null){
			try {
				String msgId = signUp.getStringProperty("msg");
				TextMessage tm = (TextMessage)signUp;
				if (msgId.equals("signUp")){
					String [] signupDetails = tm.getText().split(";");
					String user = signupDao.signUp(signupDetails[0],signupDetails[1],signupDetails[2],signupDetails[3]);
					sendReply(signUp, user);
				} 
				else if (msgId.equals("signOut")) {
					String email = tm.getText();
				}
			}
			catch (JMSException e) {
				sendReply(signUp, FAILURE);
			} 
		}
	}
}
