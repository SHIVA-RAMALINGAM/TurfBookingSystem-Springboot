package com.example.turfbooking.Turf_booking_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.turfbooking")
public class TurfBookingSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(TurfBookingSystemApplication.class, args);
	}
}
