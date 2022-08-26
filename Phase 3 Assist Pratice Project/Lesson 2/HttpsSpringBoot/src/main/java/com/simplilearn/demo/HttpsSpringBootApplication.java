package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan("com.simplilearn.demo")
public class HttpsSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpsSpringBootApplication.class, args);
	}

}
