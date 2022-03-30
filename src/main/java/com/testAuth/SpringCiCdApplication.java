package com.testAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringCiCdApplication {

@GetMapping("/")
	public String home() {
		return"Welcome To Spring Boot CI-CD deployment";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringCiCdApplication.class, args);
	}

}
