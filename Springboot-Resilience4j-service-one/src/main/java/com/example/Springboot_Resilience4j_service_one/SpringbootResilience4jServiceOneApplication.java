package com.example.Springboot_Resilience4j_service_one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

public class SpringbootResilience4jServiceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootResilience4jServiceOneApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
