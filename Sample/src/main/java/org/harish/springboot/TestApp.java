package org.harish.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class TestApp {

	@GetMapping("sayHello")
	public String sayHello() {
		return "Hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(TestApp.class, args);
	}
}
