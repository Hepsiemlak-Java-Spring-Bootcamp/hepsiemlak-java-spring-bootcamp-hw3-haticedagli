package com.hepsiemlak.emlakoop.model;

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

    //relations
    private User user;

    public Search(
            User user,
            String filter,
            boolean sendEmail
    ){
        this.id = UUID.randomUUID().toString();
        this.user = user;
        this.filter = filter;
        this.sendEmail = sendEmail;
        user.getSavedSearches().add(this);
    }
}
