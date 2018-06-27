 
package com.deepakchandwani.spring.integration.splitteraggregator;

import java.util.Collection;

import com.deepakchandwani.spring.integration.splitteraggregator.support.AbstractCriteria;
import com.deepakchandwani.spring.integration.splitteraggregator.support.CompositeCriteria;

 
public class SearchRequestSplitter {

	public Collection<AbstractCriteria> split(CompositeCriteria criteria) {
		return criteria.getCriteria();
	}
}
