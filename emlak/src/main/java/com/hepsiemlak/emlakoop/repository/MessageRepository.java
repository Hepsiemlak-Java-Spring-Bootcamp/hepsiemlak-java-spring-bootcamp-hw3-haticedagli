package com.hepsiemlak.emlakoop.repository;

import com.hepsiemlak.emlakoop.model.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class MessageRepository {

    List<Message> messages = new ArrayList<>();

    public void addMessage(Message message){
        messages.add(message);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public Message getMessageById(String id){
        for (Message message : messages) {
            if(Objects.equals(message.getId(), id)){
                return message;
            }
        }
        return null;
    }
}
