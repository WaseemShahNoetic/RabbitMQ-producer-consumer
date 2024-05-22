package com.springBootrabbitmqproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRabbitmqProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRabbitmqProducerApplication.class, args);
		System.out.println("RabbitMQ producer running.....!");
	}

}
