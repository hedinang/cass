package com.example.cass.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE_NAME = "chat_exchange";
    public static final String TEXT_QUEUE = "text_queue";
    public static final String IMAGE_QUEUE = "image_queue";

    @Bean
    public TopicExchange chatExchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    // Queue cho text
    @Bean
    public Queue textQueue() {
        return new Queue(TEXT_QUEUE, true); // durable queue
    }

    // Queue cho image
    @Bean
    public Queue imageQueue() {
        return new Queue(IMAGE_QUEUE, true); // durable queue
    }

    // Bind queue text với pattern text.*.*
    @Bean
    public Binding textQueueBinding(TopicExchange chatExchange, Queue textQueue) {
        return BindingBuilder.bind(textQueue)
                .to(chatExchange)
                .with("text.*.*");
    }

    // Bind queue image với pattern image.*.*
    @Bean
    public Binding imageQueueBinding(TopicExchange chatExchange, Queue imageQueue) {
        return BindingBuilder.bind(imageQueue)
                .to(chatExchange)
                .with("image.*.*");
    }
}