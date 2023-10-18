package com.projet.fatma.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {


    @Bean
    public NewTopic taskTopic() {
        return TopicBuilder.name("project-description-topic")
                .partitions(1)
                .replicas(1)
                .build();
    }
    @Bean
    public NewTopic LandUseTopic() {
        return TopicBuilder.name("land-use-topic")
                .partitions(1)
                .replicas(1)
                .build();
    }
}

