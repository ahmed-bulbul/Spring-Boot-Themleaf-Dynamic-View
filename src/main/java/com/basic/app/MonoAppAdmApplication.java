package com.basic.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MonoAppAdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonoAppAdmApplication.class, args);


		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "tomal";
		String encodedPassword = encoder.encode(rawPassword);
		System.out.println(encodedPassword);

		// create system admin user

	}

}
