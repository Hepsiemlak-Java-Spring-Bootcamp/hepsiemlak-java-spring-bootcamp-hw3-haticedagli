package com.hepsiemlak.client.client;

import com.hepsiemlak.client.model.Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "emlakClient", url = "http://localhost:8080")
public interface EmlakClient {

    @RequestMapping(method = RequestMethod.POST, value = "/message")
    void saveMessage(@RequestBody Message message);

    @RequestMapping(method = RequestMethod.GET, value = "/message")
    List<Message> getMessages();

    @RequestMapping(method = RequestMethod.GET, value = "/message/{messageId}", produces = "application/json")
    Message getMessageById(@PathVariable("messageId") String messageId);
}
