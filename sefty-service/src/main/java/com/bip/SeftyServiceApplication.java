package com.bip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SeftyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeftyServiceApplication.class, args);
	}

}
