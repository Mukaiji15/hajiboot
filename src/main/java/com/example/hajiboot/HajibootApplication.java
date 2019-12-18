package com.example.hajiboot;

import com.example.app.Argument;
import com.example.app
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestControlle

@SpringBootApplication
@RestController
public class HajibootApplication {

	@GetMapping("/")
	String home(){
		return "Hello spring boot";
	}
	public static void main(String[] args) {
		SpringApplication.run(HajibootApplication.class, args);
	}

}
