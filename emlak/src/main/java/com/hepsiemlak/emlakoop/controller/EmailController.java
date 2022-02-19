package com.hepsiemlak.emlakoop.controller;

import com.hepsiemlak.emlakoop.model.Email;
import com.hepsiemlak.emlakoop.queue.ActiveMqService;
import com.hepsiemlak.emlakoop.queue.RabbitMqService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {

    public final ActiveMqService activeMqService;
    public final RabbitMqService rabbitMqService;

    @PostMapping("/activemq")
    public void sendEmailWithActiveMq(@RequestBody Email email){
        activeMqService.sendEmail(email);
    }

    @PostMapping("/rabbitmq")
    public void sendEmailWithRabbitMq(@RequestBody Email email){
        rabbitMqService.sendEmail(email);
    }
}
