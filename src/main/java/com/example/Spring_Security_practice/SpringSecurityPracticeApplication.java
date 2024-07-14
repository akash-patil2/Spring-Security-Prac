package com.example.Spring_Security_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityPracticeApplication {

	public static void main(String[] args) {

		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		System.out.println("The encoded version of password" +
				" is " + passwordEncoder.encode("password"));


		SpringApplication.run(SpringSecurityPracticeApplication.class, args);
	}


}
