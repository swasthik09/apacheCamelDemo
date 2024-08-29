package com.swasthik.apacheCamel.microserviceA.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqMessageSenderRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:active-mq-timer?period=10000")
		.transform().constant("my message for active mq")
		.log("${body}")
		.to("activemq:my-activemq-queue");
	}

}
