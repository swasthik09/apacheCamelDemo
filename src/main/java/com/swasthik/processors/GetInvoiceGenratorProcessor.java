package com.swasthik.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Service;

import com.swasthik.transformation.UserInvoiceResponse;

@Service
public class GetInvoiceGenratorProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		UserInvoiceResponse[] response = exchange.getIn().getBody(UserInvoiceResponse[].class);
		exchange.getIn().setBody(response);
		System.out.println();
	}

}
