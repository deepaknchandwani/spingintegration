 
package com.deepakchandwani.spring.integration.splitteraggregator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.deepakchandwani.spring.integration.splitteraggregator.support.CriteriaA;
 
public class SearchA {

	private static final Log LOGGER = LogFactory.getLog(SearchA.class);

	private long executionTime = 1000L;

	public Result search(CriteriaA criteria) {

		LOGGER.info(String.format("This search will take %sms.", executionTime));

		try {
			Thread.sleep(executionTime);
		} catch (InterruptedException e) {
		}
		return new Result();
	}

	public long getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(long executionTime) {
		this.executionTime = executionTime;
	}
}
