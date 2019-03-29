package com.poldichen.apskitting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApsKittingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApsKittingApplication.class, args);
	}

}

