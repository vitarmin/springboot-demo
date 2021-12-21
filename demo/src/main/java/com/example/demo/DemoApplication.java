package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@RequestMapping(value="/")
//	public String hello(){
////		String upperCaseLetters = RandomStringUtils.random(2, 65, 90, true, true);
////		String lowerCaseLetters = RandomStringUtils.random(2, 97, 122, true, true);
////		String numbers = RandomStringUtils.randomNumeric(2);
////		String specialChar = RandomStringUtils.random(2, 33, 47, false, false);
////		String totalChars = RandomStringUtils.randomAlphanumeric(2);
////		String combinedChars = upperCaseLetters.concat(lowerCaseLetters)
////				.concat(numbers)
////				.concat(specialChar)
////				.concat(totalChars);
//		return "HELLO";
//	}
}
