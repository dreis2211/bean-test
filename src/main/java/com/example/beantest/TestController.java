package com.example.beantest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@RestController
public class TestController {

	private final RequestMappingHandlerMapping handlerMapping;

	public TestController(RequestMappingHandlerMapping handlerMapping) {
		this.handlerMapping = handlerMapping;
	}

	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}

}
