package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MicroservicesbootApplication extends SpringBootServletInitializer {

	
	/*
	 * used when run as JAR
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesbootApplication.class, args);
	}

	/*
	 * used when run as WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(MicroservicesbootApplication.class);
	}
	
	
	
	
}
