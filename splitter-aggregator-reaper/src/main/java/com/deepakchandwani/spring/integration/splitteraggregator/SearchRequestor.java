 
package com.deepakchandwani.spring.integration.splitteraggregator;

import com.deepakchandwani.spring.integration.splitteraggregator.support.CompositeCriteria;

 
public interface SearchRequestor {

	CompositeResult search(CompositeCriteria criteria);
}
