package com.swasthik.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogIncomingMessageProcessor implements Processor{
	
	private Logger log = LoggerFactory.getLogger(LogIncomingMessageProcessor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn();
		log.warn(exchange.getIn().getBody().toString());
	}
}
