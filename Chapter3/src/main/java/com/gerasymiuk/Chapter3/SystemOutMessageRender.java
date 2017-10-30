package com.gerasymiuk.Chapter3;

import javax.annotation.Resource;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageRender")
public class SystemOutMessageRender implements MessageRender {
	private MessageProvider messageProvider;
	@Override
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException(
			"You must set the property messageProvider of class:"
			+ SystemOutMessageRender.class.getName());
			// Должно быть установлено свойство messageProvider класса
			}
			System.out.println(messageProvider.getMessage());

	}

	@Override
	//@Autowired
	@Resource(name="messageProvider")
	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;

	}

	@Override
	public MessageProvider getMessageProvider() {		
		return messageProvider;
	}

}
