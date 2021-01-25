package com.kayaTech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserGradeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserGradeServiceApplication.class, args);
	}

}
