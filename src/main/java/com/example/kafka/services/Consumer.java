package com.example.kafka.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {

    @KafkaListener(topics = "topic1", groupId = "group_id")
    public void consume(String message) throws Exception {
        log.info(String.format("#### -> Consumed message -> %s", message));
    }

}
