package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineshopingtlApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineshopingtlApplication.class, args);
	}

	public String add() {
		return "well come to the remote";
	}
	
	public String go() {
		return "janmane ";
	}
}
