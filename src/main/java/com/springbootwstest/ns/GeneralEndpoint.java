package com.springbootwstest.ns;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Controller
public class GeneralEndpoint {
	private static final String NAMESPACE_URI = "http://springbootwstest.com/ns";
	private Logger logger=LoggerFactory.getLogger(GeneralEndpoint.class);
	
	/**
	 * 	Input parameters: 
		SGSNIP address
		Output parameters:
		OpCoCode
		OpCoDesc
		OpCoId
		MCCMNCCode
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "testRequest")
	@ResponsePayload
	public TestResponse getServingpCoBySgsnIp(@RequestPayload TestRequest request) {
		logger.info("testOp(..)");
		TestResponse result=new TestResponse();
		result.setId((long)(Math.random()*1000));
		return result;
	}
	
}
