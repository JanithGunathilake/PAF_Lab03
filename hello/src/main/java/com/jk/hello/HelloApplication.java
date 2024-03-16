package com.jk.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@GetMapping("/")
	public String rootEndpoint() {
		String message = "Hello World!";
		return message;
	}

	@GetMapping("/hello")
	public String helloEndpoint() {
		String message = "Hello World from hello endpoint";
		return message;
	}

	@GetMapping("/helloname")
	public String helloName(@RequestParam(required = false, defaultValue = "Guest") String name) {
		System.out.println("Received Parameter: " +name);
		return "Hello " + name + "!";
	}

}
