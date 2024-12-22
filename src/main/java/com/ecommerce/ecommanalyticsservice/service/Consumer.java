package com.ecommerce.ecommanalyticsservice.service;

import com.ecommerce.ecommanalyticsservice.entity.Analytics;
import com.ecommerce.ecommanalyticsservice.repository.AnalyticsRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

    @Autowired
    private AnalyticsRepository analyticsRepository;
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "product-events", groupId = "1")
    public void consumeProductEvent(String message) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Analytics analytics = mapper.readValue(message, Analytics.class);
        logger.info(analytics.toString());
        logger.info("### -> Consumed message -> {}", analytics.getEvent());
    }

    @KafkaListener(topics = "order-events", groupId = "1")
    public void consumeOrderEvent(String message) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Analytics analytics = mapper.readValue(message, Analytics.class);
        logger.info(analytics.toString());
        logger.info("### -> Consumed message -> {}", analytics.getEvent());
    }
}
