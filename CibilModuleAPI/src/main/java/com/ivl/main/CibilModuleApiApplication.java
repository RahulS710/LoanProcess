package com.ivl.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
public class CibilModuleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CibilModuleApiApplication.class, args);
	}


	@Bean
	public RestTemplate restTemplate2()
	{
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}

