package com.hepsiemlak.emlakoop.config;

import lombok.Data;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Data
@Configuration
public class ActiveMqConfig {

    @Value("${spring.activemq.broker-url}")
    private String BROKER_URL;
    @Value("${spring.activemq.user}")
    private String BROKER_USERNAME;
    @Value("${spring.activemq.password}")
    private String BROKER_PASSWORD;
    @Value("${spring.activemq.queue-name}")
    private String QUEUE_NAME;

    public ActiveMQQueue queue() {
        return new ActiveMQQueue(QUEUE_NAME);
    }

    @Bean
    public ActiveMQConnectionFactory connectionFactory(){
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL(BROKER_URL);
        connectionFactory.setPassword(BROKER_USERNAME);
        connectionFactory.setUserName(BROKER_PASSWORD);
        return connectionFactory;
    }

    @Bean
    public JmsTemplate activeMqTemplate(){
        JmsTemplate template = new JmsTemplate();
        template.setDefaultDestination(queue());
        template.setConnectionFactory(connectionFactory());
        return template;
    }
}
