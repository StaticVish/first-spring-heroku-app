package com.upmacoders.app.firstapp.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class HelloWorldModel {
	private String greeting;
}
