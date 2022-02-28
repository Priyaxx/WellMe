package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@SpringBootApplication
public class MedishopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedishopApplication.class, args);
	}
	@GetMapping("/booking")
	public String form(){
		return "form.html";
	}

}
