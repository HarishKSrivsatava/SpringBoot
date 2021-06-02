package org.harish.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestApp {

	@GetMapping("/sayHello")
	String sayHello() {
		return "Hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(TestApp.class, args);
	}
}
