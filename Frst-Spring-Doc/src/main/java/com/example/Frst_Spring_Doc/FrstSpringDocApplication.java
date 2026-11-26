package com.example.Frst_Spring_Doc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FrstSpringDocApplication {

	@GetMapping("/")
	public String home() {
		return "Sarvan pilli";
	}

	public static void main(String[] args) {
		SpringApplication.run(FrstSpringDocApplication.class, args);
	}
}
