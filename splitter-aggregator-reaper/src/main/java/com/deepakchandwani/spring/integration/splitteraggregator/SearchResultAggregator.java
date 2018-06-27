 
package com.deepakchandwani.spring.integration.splitteraggregator;

import java.util.Collection;

 
public class SearchResultAggregator {
	public Result aggregate(Collection<Result> results) {
		CompositeResult result = new CompositeResult();
		result.getResults().addAll(results);
		return result;
	}
}
