package com.upmacoders.app.firstapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.upmacoders.app.firstapp.controller.HelloWorldController;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FirstappApplicationTests {
	@Autowired
	HelloWorldController controller;

	@Test
	public void contextLoads() {
	}

	@Test
	public void checkResponse() {
		log.info(controller.helloWorld());

	}

}
