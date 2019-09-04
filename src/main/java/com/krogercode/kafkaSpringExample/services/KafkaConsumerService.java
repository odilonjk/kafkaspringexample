package com.krogercode.kafkaSpringExample.services;

import com.krogercode.kafkaSpringExample.dtos.TransactionDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "${app.topic.transaction}")
    public void receive(@Payload TransactionDTO message) {
        System.out.println(message.toString());
    }

}
