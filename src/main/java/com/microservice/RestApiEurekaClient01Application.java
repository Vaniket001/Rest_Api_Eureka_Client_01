package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestApiEurekaClient01Application {

	public static void main(String[] args) {
		SpringApplication.run(RestApiEurekaClient01Application.class, args);
		System.out.println("RestApiEurekaClient01Application Has Started !!");
	}

}
