package com.example.rakeshb.sbcamel.configuration;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActiveMQConfiguration {

	public static final String EMP_QUEUE = "employee.queue";
	
	@Bean
	public Queue employeeQueue(){
		return new ActiveMQQueue(EMP_QUEUE);
	}
}
