package server.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;



import server.jms.entity.User;

public class SignInConsumer extends MarketPlaceConsumer {

	public SignInConsumer(String queueName){
		super(queueName);
	}

	public void onMessage(Message signIn) {
		if (signIn != null){
			try {
				String msgId = signIn.getStringProperty("msg");
				TextMessage tm = (TextMessage)signIn;
				if (msgId.equals("signIn")){
					String [] authencticationDetails = tm.getText().split(";");
					String user = userDao.signIn(authencticationDetails[0],authencticationDetails[1]);
					sendReply(signIn, user);
				} 
				else if (msgId.equals("signOut")) {
					String email = tm.getText();
				}
			}
			catch (JMSException e) {
				sendReply(signIn, FAILURE);
			} 
		}
	}
}
