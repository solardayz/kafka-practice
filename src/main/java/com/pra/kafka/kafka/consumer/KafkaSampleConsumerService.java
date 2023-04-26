package com.pra.kafka.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaSampleConsumerService {
	
	@KafkaListener(topics = "clc", groupId = "group-id-clc")
	public void consum(String message) {
		System.out.println("KafkaSampleConsumerService message :: "+message);
	}
}
