package com.swasthik.apacheCamel.microserviceA.routes;

import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.swasthik.apacheCamel.microserviceA.processors.LogIncomingMessageProcessor;
import com.swasthik.apacheCamel.microserviceA.transformation.GetCurrentTimeTransformation;

//@Component
public class MyFirstRoute  extends RouteBuilder{

	@Autowired
	private GetCurrentTimeTransformation GetCurrentTime;
	
	@Autowired
	private LogIncomingMessageProcessor  logProcessor;
	
	@Override
	public void configure() throws Exception {
		from("timer:swasthik-timer")
		.transform().constant("time now is " + LocalDateTime.now())
		//.bean(GetCurrentTime , "getCurrentTimeOnlyDate")
		.process(logProcessor)
		.to("log:swasthik-timer");
	}

}
