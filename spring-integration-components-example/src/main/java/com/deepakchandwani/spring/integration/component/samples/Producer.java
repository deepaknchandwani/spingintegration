package com.deepakchandwani.spring.integration.component.samples;

public class Producer {
	
	private static Integer value = 0;
	
	public String produce() {
		return (++value).toString();
	}
}
