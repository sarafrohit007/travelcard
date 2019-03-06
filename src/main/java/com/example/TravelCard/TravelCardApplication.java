package com.example.TravelCard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages={""})
public class TravelCardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelCardApplication.class, args);
		System.out.println("Printing result finally.....");
	}
	
	

}

