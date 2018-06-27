package com.deepakchandwani.spring.integration.component.samples;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

@SuppressWarnings("unused")
public class Startup {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
		// check them one by one refering the 
		// spring integration xml, most of them are  system out components
		// which can be replaced by any channel
		
		// run one at a time       <------------------------------------------imp

		
	//	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//				"/META-INF/spring/si-components-adapter.xml");
//				"/META-INF/spring/si-components-stdinout-adapter.xml");
//				"/META-INF/spring/si-components-file-adapter.xml");
//				"/META-INF/spring/si-components-filter.xml"); 
				
		// this transforms the string reverse for 
		// simplicity the input output channels are system out channels
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/si-components-transformers.xml");
	
			
		// run one at a time       <------------------------------------------imp
		
		// if you type the name of channel it will print as all three channels are print out channels 
		// they can be any thing
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/si-components-router.xml");
			
				
		// run one at a time       <------------------------------------------imp
		
				
/*		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(		"/META-INF/spring/si-components-activator.xml");
		MessageChannel channel = context.getBean("inboundChannel",MessageChannel.class);
		TestPayload payload = new TestPayload();
		payload.setProperty1( 1 );
		payload.setProperty2( "i'm a gateway" );
		
 		
 		Message<TestPayload> msg = MessageBuilder.withPayload( payload ).build();
 		channel.send(msg);*/

		
		
		// run one at a time       <------------------------------------------imp

		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/si-components-enricher.xml");	
 		MessageChannel channel = context.getBean("inboundChannel",MessageChannel.class);
 		
 		TestPayload payload = new TestPayload();
		payload.setProperty1( 1 );
		payload.setProperty2( "i'm 
		a gateway" );
		
 		
 		Message<TestPayload> msg = MessageBuilder.withPayload( payload ).build();
 		channel.send(msg);*/
		
		// run one at a time       <------------------------------------------imp
		
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/si-components-gateway.xml");
		TestPayload payload = new TestPayload();
		payload.setProperty1( 1 );
		payload.setProperty2( "i'm a gateway" );
		TestGateway gateway = context.getBean("gateway", TestGateway.class);
		gateway.invoke(payload);*/
		
	}

}
