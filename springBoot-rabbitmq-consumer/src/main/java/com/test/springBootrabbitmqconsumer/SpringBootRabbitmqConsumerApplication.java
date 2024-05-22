package com.test.springBootrabbitmqconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRabbitmqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRabbitmqConsumerApplication.class, args);
		System.out.println("RabbitMQ Consumer running......!");
	}

}
