package com.upmacoders.app.firstapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upmacoders.app.firstapp.model.HelloWorldModel;

@Service
public class HelloWorldService {

	@Autowired
	private HelloWorldModel model;

	public HelloWorldModel sayGreeting() {
		model.setGreeting("RESTful World !!");
		return model;

	}
}
