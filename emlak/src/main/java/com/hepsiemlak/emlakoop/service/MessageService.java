package com.hepsiemlak.emlakoop.service;

import com.hepsiemlak.emlakoop.model.Message;
import com.hepsiemlak.emlakoop.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {

    public final MessageRepository messageRepository;

    public void saveMessage(Message message){
        messageRepository.addMessage(message);
    }

    public List<Message> getMessages(){
        return messageRepository.getMessages();
    }

    public Message getMessage(String id){
        return messageRepository.getMessageById(id);
    }
}
