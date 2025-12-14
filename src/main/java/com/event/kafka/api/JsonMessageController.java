package com.event.kafka.api;

import com.event.kafka.bean.User;
import com.event.kafka.kafka.JsonKafkaProducer;
import com.event.kafka.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/json/kafka")
public class JsonMessageController {
    @Autowired
    JsonKafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<Map> publishMessageToKafka(@RequestBody User user){
        kafkaProducer.sendJsonMessage(user);
        return ResponseEntity.ok().body(Map.of("status","Json Message sent to Kafka"));
    }
}
