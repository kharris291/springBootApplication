package com.locateALocum.techTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages = {"com.locateALocum"})
public class LocateALocumApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocateALocumApplication.class, args);
	}
	

}
