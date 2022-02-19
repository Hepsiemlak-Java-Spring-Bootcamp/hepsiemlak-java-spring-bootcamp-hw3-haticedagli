package com.hepsiemlak.emlakoop.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@ToString
public class Message {
    private String id;
    private Advert advert;
    private User to;
    private User from;
    private boolean seen;
    private String message;
    private Date sendDate;

    public Message(
            Advert advert,
            User to,
            User from,
            String message
    ){
        this.id = UUID.randomUUID().toString();
        this.advert = advert;
        this.to = to;
        this.from = from;
        this.seen = false;
        this.message = message;
        this.sendDate = new Date();
        //to.getMessages().add(this);
        //from.getMessages().add(this);
    }
}
