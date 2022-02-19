package com.hepsiemlak.emlakoop.controller;

import com.hepsiemlak.emlakoop.model.Message;
import com.hepsiemlak.emlakoop.model.User;
import com.hepsiemlak.emlakoop.repository.MessageRepository;
import com.hepsiemlak.emlakoop.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class MessageController {

    public final MessageService messageService;

    @GetMapping
    public List<Message> getMessages() {
        return messageService.getMessages();
    }

    @PostMapping
    public void saveMessage(@RequestBody Message message){
        messageService.saveMessage(message);
     }

    @GetMapping("/{id}")
    public Message getMessage(@PathVariable("id") String id) {
        return messageService.getMessage(id);
    }
}
