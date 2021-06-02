package org.harish.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@EnableAutoConfiguration
@ComponentScan
@Configuration
@RestController
public class TestApp {

	@GetMapping("hello")
	public String sayHello() {
		return "Hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(TestApp.class, args);
	}
}
