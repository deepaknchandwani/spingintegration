 
package com.deepakchandwani.spring.integration.splitteraggregator;

import java.util.ArrayList;
import java.util.Collection;

 
public class CompositeResult extends Result {
	private Collection<Result> results = new ArrayList<Result>();

	public Collection<Result> getResults() {
		return results;
	}
}
