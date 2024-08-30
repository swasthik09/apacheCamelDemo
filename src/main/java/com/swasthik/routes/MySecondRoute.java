package com.swasthik.routes;



import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class MySecondRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		restConfiguration()
        .component("servlet")
	    .port(9091)
	    .host("localhost")
        .bindingMode(RestBindingMode.json);
		
		rest("/swasthik").get("/helloworld").to("direct:welcome-route");
		
		from("direct:welcome-route")
		.setBody(simple("hello world"));

	}

}
