package com.springboot.kafka.Kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String TOPIC_NAME;

    @Bean
    public NewTopic javaGuidesTopic() {
        return TopicBuilder.name(TOPIC_NAME).build();
    }
}
