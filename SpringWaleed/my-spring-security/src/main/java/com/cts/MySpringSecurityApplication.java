package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MySpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringSecurityApplication.class, args);
	}
	
	@RequestMapping("/user")
	String userMessage() {
		return "Hey there user...";
	}
	
	@RequestMapping("/admin")
	String adminMessage() {
		return "Hey there Admin...";
	}

}
