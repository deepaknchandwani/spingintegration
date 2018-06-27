 
package com.deepakchandwani.spring.integration.splitteraggregator.support;

 
public final class TestUtils {

	/**
	 * Private constructor to prevent instantiation.
	 */
	private TestUtils() {
	}

	public static CompositeCriteria getCompositeCriteria() {

		final CompositeCriteria generalCriteria = new CompositeCriteria();
		generalCriteria.getCriteria().add(new CriteriaA());
		generalCriteria.getCriteria().add(new CriteriaB());
		return generalCriteria;

	}
}
