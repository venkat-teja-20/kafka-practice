package com.event.kafka.kafka;

import com.event.kafka.bean.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = "practicekafka1_json",groupId = "group1")
    public void consume(User user){
        System.out.println("Json message received : "+user.toString());
    }
}
