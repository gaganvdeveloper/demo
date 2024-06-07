package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping
	public String m1() {
		return "Welcome to Spring Boot App...";
	}
	
	@GetMapping("/hi")
	public String m2() {
		return "Hello... I Hope u are Doing Well...";
	}
	
	@PostMapping
	public String m3() {
		return "You Are Posting something...";
	}
	
	
}
