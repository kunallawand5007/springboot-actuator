/**
 * 
 */
package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

/**
 * @author kunal.lawand
 * HealthIndicator
 * AbstractHealthIndicator  
 */
@Component
public class CustomHealthIndicator  extends AbstractHealthIndicator{

	@Override
	protected void doHealthCheck(Builder builder) throws Exception {
	
		// if we throw exception here then status will show as down
		//throw new RuntimeException("STATUS will down");
	
		Map<String, String> details=new HashMap<String, String>();
		details.put("App", "I am running ..!!");
		details.put("Error", "Uptil now no error");
		
	 builder.up().withDetails(details);	
	
	}

}
