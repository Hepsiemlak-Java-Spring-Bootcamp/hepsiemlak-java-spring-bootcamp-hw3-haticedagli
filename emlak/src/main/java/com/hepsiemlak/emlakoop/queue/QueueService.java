package com.hepsiemlak.emlakoop.queue;

import com.hepsiemlak.emlakoop.model.Email;
import com.hepsiemlak.emlakoop.model.Message;

public interface QueueService {
	
	void sendEmail(Email email);

}
