package com.upmacoders.app.firstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.upmacoders.app.firstapp.model.HelloWorldModel;
import com.upmacoders.app.firstapp.service.HelloWorldService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloWorldController {

	@Autowired
	private HelloWorldService service;

	@GetMapping("/json")
	public HelloWorldModel helloWorldJSON() {
		HelloWorldModel model = service.sayGreeting();
		log.debug(model.toString());
		return model;
	}

	@GetMapping("/")
	public ModelAndView helloWorldString() {
		ModelAndView modelandView = new ModelAndView("index");
		modelandView.addObject("greeting", service.sayGreeting().getGreeting());
		return modelandView;
	}

}
