package com.octopus.microservicetest1.config;


import com.octopus.microservicetest1.model.User;
import com.octopus.microservicetest1.service.implementation.UserService;
import com.octopus.microservicetest1.service.interfaces.IUserService;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ApplicationConfiguration {



    @Bean
    public IUserService userService() {
        return new UserService();
    }

}
