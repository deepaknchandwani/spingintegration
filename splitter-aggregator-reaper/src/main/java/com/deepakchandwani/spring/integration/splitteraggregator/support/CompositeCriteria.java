 
package com.deepakchandwani.spring.integration.splitteraggregator.support;

import java.util.ArrayList;
import java.util.Collection;

 
public class CompositeCriteria extends AbstractCriteria {

	private final Collection<AbstractCriteria> criteria = new ArrayList<AbstractCriteria>();

	public Collection<AbstractCriteria> getCriteria() {
		return criteria;
	}
}
