package com.gerasymiuk.Chapter3;

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
	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;

	}

	@Override
	public MessageProvider getMessageProvider() {		
		return messageProvider;
	}

}
