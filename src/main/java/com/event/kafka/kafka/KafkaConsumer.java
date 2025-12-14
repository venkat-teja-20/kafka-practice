package com.event.kafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "practicekafka1", groupId = "group1")
    public void consumeMessage(String message){
        System.out.println("Message Consumed from Kafka : "+message);
    }
}
