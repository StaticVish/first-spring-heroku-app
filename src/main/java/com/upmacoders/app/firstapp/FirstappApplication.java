package com.upmacoders.app.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.upmacoders.app.firstapp.controller.HelloWorldController;

@SpringBootApplication
public class FirstappApplication {

	@Autowired
	HelloWorldController controller;

	public static void main(String[] args) {
		SpringApplication.run(FirstappApplication.class, args);
	}
}
