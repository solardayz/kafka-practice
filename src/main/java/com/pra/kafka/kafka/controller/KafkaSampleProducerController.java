package com.pra.kafka.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pra.kafka.kafka.producer.KafKaSampleProducerService;

@RestController
public class KafkaSampleProducerController {

	@Autowired
	private KafKaSampleProducerService kafKaSampleProducerService;
	
	@PostMapping("/sendMessage")
	public void sendMessage(String message) {
		kafKaSampleProducerService.sendMessage(message);		
	}
}
