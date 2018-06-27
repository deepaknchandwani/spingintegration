package com.deepakchandwani.spring.integration.component.samples;

import org.springframework.messaging.Message;

public class Service {
	public void method1(Message<TestPayload> msg) {
		System.out.println("method1");
		System.out.println( msg.getPayload() );
	}

	public void method2(TestPayload payload) {
		System.out.println("method2");
		System.out.println(payload);
	}
	
	public void method3() {
		System.out.println("method3");
	}
}
