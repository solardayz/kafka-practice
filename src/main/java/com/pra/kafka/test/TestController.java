package com.pra.kafka.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test/{text}")
	public String test(@PathVariable String text) {
		System.out.println("text  :"+text);
		return text;	
	}
	
	@GetMapping("/test")
	public String testParam(@RequestParam String text) {
		return text;
		
	}
}