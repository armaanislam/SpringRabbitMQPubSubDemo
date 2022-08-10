package com.javatech.springrabbitmq.demo.consumer;

import com.javatech.springrabbitmq.demo.config.MessagingConfig;
import com.javatech.springrabbitmq.demo.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {
    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message received from queue"+ orderStatus);
    }
}
