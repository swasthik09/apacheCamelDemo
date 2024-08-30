package com.swasthik.transformation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class InvoiceService {
	
	public UserInvoiceResponse getInvoices() {
		List<UserInvoiceResponse> invoice = new ArrayList<>();
		UserInvoiceResponse userInvoiceResponse = new UserInvoiceResponse();
		userInvoiceResponse.setAmount(100d);
		userInvoiceResponse.setDue_date("22-2-2025");
		userInvoiceResponse.setId(1l);
		userInvoiceResponse.setPaid_amount(50d);
		userInvoiceResponse.setStatus(InvoiceStatus.PENDING);
		invoice.add(userInvoiceResponse);
		return userInvoiceResponse;
	}

}
