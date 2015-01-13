package server.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;




import server.jms.dao.CategoryDisplay;
import server.jms.entity.User;

public class addCategory extends MarketPlaceConsumer {

	public addCategory(String queueName){
		super(queueName);
	}

	public void onMessage(Message addComments) {
		if (addComments != null){
			try {
				String msgId = addComments.getStringProperty("msg");
				TextMessage tm = (TextMessage)addComments;
				if (msgId.equals("addCategory")){
					String [] signupDetails = tm.getText().split(";");
					CategoryDisplay user = addCategoryDao.addComments(signupDetails[0],signupDetails[1],signupDetails[2],signupDetails[3],signupDetails[4]);
					String split = signupDetails[1];
					sendReply(addComments, split);
				} 
				else if (msgId.equals("signOut")) {
					String email = tm.getText();
				}
			}
			catch (JMSException e) {
				sendReply(addComments, FAILURE);
			} 
		}
	}
}
