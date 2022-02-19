package com.hepsiemlak.emlakoop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {})
public class EmlakOopApplication {

	@Autowired
	public MockService mockService;

	public static void main(String[] args) {
		SpringApplication.run(EmlakOopApplication.class, args);
	}

	@Bean
	public void runMockService() {
		mockService.generateMockData();
	}
}
