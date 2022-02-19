package com.hepsiemlak.emlakoop.queue;

import com.hepsiemlak.emlakoop.config.RabbitMqConfig;
import com.hepsiemlak.emlakoop.model.Email;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqService implements QueueService {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	@Autowired
	private RabbitMqConfig config;

	@Override
	public void sendEmail(Email email) {
		rabbitTemplate.convertAndSend(config.getExchange(), config.getRoutingkey(), email);
	}
}
