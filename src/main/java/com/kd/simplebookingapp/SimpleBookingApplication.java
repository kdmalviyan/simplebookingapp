package com.kd.simplebookingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync(proxyTargetClass = true)
public class SimpleBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleBookingApplication.class, args);
	}
}
