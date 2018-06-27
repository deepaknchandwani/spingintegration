package com.deepakchandwani.spring.integration.component.samples;

import org.springframework.messaging.Message;

public class Consumer {
	public void consume(Message<String> msg) {
		System.out.println( "Consumed: " + msg.getPayload() );
	}
}
