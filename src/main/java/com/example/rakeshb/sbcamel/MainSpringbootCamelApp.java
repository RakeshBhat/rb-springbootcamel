package com.example.rakeshb.sbcamel;

import org.apache.camel.spring.boot.CamelSpringBootApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainSpringbootCamelApp {

	public static void main(String[] args) {
	       ConfigurableApplicationContext configurableApplicationContext = 

	    		   SpringApplication.run(MainSpringbootCamelApp.class, args);
	    		           CamelSpringBootApplicationController configurableApplicationContextBean = 

	    		   configurableApplicationContext.getBean(CamelSpringBootApplicationController.class);
	    		           configurableApplicationContextBean.blockMainThread();

	}

}
