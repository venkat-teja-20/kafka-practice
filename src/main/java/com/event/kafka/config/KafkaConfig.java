package com.event.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic kafkaPracticeTopic(){
        return TopicBuilder
                .name("practicekafka1")
                .build();
    }

    @Bean
    public NewTopic kafkaPracticeJsonTopic(){
        return TopicBuilder
                .name("practicekafka1_json")
                .build();
    }
}
