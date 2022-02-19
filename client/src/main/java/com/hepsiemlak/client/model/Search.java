package com.hepsiemlak.client.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Search {
    private String id;
    private String filter;
    private boolean sendEmail;

    public Search(
            User user,
            String filter,
            boolean sendEmail
    ){
        this.id = UUID.randomUUID().toString();
        this.filter = filter;
        this.sendEmail = sendEmail;
    }
}
