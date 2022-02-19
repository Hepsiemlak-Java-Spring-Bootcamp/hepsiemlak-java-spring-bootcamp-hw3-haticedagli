package com.hepsiemlak.client.controller;

import com.hepsiemlak.client.client.EmlakClient;
import com.hepsiemlak.client.model.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class EmlakClientController {

    public final EmlakClient emlakClient;

    @GetMapping
    public List<Message> getMessages() {
        return emlakClient.getMessages();
    }

    @PostMapping
    public void saveMessage(@RequestBody Message message){
        emlakClient.saveMessage(message);
    }

    @GetMapping("/{id}")
    public Message getMessage(@PathVariable("id") String id) {
        return emlakClient.getMessageById(id);
    }
}
