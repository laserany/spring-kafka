package com.example.kafka.controllers;

import com.example.kafka.services.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private Producer producer;

    @PostMapping("/publish")
    public void sendMessageToKafka(@RequestParam("message") String message) {
        producer.sendMessage(message);
    }
}
