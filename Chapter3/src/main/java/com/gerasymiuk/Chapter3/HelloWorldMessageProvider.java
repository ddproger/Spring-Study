package com.gerasymiuk.Chapter3;

import org.springframework.stereotype.Service;

//@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World";
	}

}
