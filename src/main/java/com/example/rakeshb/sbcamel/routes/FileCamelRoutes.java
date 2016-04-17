package com.example.rakeshb.sbcamel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.example.rakeshb.sbcamel.processor.BasicFileProcessor;

@Component
public class FileCamelRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("{{emp.queue.url}}")
		.process(new BasicFileProcessor())
		.to("{{emp.input.dir}}")
		.end();		
	}

}
