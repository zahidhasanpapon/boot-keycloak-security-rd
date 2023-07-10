package com.example.rdbootcloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RdBootCloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdBootCloakApplication.class, args);
	}

//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

}
