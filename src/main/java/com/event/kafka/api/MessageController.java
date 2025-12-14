package com.event.kafka.api;

import com.event.kafka.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/kafka")
public class MessageController {

    @Autowired
    KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<Map> publishMessageToKafka(@RequestParam(value = "message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok().body(Map.of("status","Message sent to Kafka"));
    }
}
