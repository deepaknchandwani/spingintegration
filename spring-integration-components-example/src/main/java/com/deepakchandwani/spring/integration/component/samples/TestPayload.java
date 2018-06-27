package com.deepakchandwani.spring.integration.component.samples;

public class TestPayload {
	private Integer property1;
	private String  property2;
	
	public Integer getProperty1() {
		return property1;
	}
	public void setProperty1(Integer property1) {
		this.property1 = property1;
	}
	public String getProperty2() {
		return property2;
	}
	public void setProperty2(String property2) {
		this.property2 = property2;
	}
	
	@Override
	public String toString() {
		return "property1 = " + property1 + "; property2 = " + property2;
	}
	
}
