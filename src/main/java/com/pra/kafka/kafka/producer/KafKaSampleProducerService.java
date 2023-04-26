package com.pra.kafka.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafKaSampleProducerService {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemple;
	
	public void sendMessage(String message) {
		System.out.println("KafKaSampleProducerService send message :: "+message);
		this.kafkaTemple.send("clc", message);
	}
}
