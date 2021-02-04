package fundamentos.model;

import Interfaces.IEmail;
import Interfaces.IMessage;

public class Mobile implements IEmail, IMessage {
	String text;
	String destination;
		
	@Override
	public String sendEmail(String message, String person) {
		this.text = message;
		this.destination = person;
		return String.format("Email to: %s; %s.", destination, text);
	}

	@Override
	public String sendMessage(String message, String person) {
		this.text = message;
		this.destination = person;
		return String.format("Message to: %s; %s.", destination, text);
	}
	
	
	
	
	
	
}
