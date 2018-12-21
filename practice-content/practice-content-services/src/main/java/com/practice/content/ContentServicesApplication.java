package com.practice.content;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.practice")
public class ContentServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentServicesApplication.class, args);
	}
}
