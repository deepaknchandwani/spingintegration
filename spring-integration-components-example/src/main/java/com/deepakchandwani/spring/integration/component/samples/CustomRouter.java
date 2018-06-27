package com.deepakchandwani.spring.integration.component.samples;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.integration.router.AbstractMessageRouter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class CustomRouter extends AbstractMessageRouter implements ApplicationContextAware {
	
	private ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	protected Collection<MessageChannel> determineTargetChannels(Message<?> msg) {
		
		if ( msg.getPayload() instanceof String ) {
			MessageChannel channel;
			try {
				channel = applicationContext.getBean( msg.getPayload().toString(), MessageChannel.class);
				if ( channel != null ) {
					return Arrays.asList( channel );
				}
			} catch (BeansException e) {
			}
		}
		
		return Collections.emptyList();
	}

}
