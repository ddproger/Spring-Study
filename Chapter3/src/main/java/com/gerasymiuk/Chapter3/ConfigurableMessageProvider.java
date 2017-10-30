package com.gerasymiuk.Chapter3;

public class ConfigurableMessageProvider implements MessageProvider {
	private String message;
	public ConfigurableMessageProvider(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
