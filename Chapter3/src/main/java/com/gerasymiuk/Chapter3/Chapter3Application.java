package com.gerasymiuk.Chapter3;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Chapter3Application {

	public static void main(String[] args) {
		//SpringApplication.run(Chapter3Application.class, args);
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/bean-config-annotation-xml.xml");
		//ctx.load("classpath:META-INF/spring/bean-config-xml.xml");
		
		ctx.refresh();
		MessageRender render = ctx.getBean("messageRender", MessageRender.class);
		//MessageProvider messageProvider = ctx.getBean("messageProvider", MessageProvider.class);
		render.render();
		//System.out.println(messageProvider.getMessage());
	}
}
