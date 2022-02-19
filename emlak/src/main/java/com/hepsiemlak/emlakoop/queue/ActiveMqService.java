package com.hepsiemlak.emlakoop.queue;


import com.hepsiemlak.emlakoop.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ActiveMqService implements QueueService{

	@Autowired
	private JmsTemplate activeMqTemplate;

	@Override
	public void sendEmail(Email email) {
		activeMqTemplate.convertAndSend(email);
	}

}
