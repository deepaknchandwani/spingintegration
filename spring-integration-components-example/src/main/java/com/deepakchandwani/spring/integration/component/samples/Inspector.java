package com.deepakchandwani.spring.integration.component.samples;

import org.springframework.messaging.Message;

public class Inspector {
	public void inspect(Message<?> msg) {
		
		System.out.println( "-- header --" );
		
		for ( String header : msg.getHeaders().keySet() ) {
			System.out.println( header + " : " + msg.getHeaders().get( header ) );
		}
		
		System.out.println( "-- payload --" );
		System.out.println( msg.getPayload() );
	}
}
