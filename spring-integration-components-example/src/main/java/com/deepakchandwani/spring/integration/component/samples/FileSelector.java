package com.deepakchandwani.spring.integration.component.samples;

import java.io.File;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

public class FileSelector implements MessageSelector {
	
	public boolean accept(Message<?> message) {
		boolean accepted = false;
		if (message.getPayload() instanceof File
				&& ((File) message.getPayload()).getName().startsWith("msg1")) {
			accepted = true;
		}
		
		System.out.println( "Message " + message.getHeaders().getId() + ( accepted ? " accepted" : " rejected") );
		
		return accepted;
	}

}
