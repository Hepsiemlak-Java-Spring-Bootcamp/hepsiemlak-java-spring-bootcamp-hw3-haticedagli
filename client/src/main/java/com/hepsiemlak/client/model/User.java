package com.hepsiemlak.client.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
public class User {

    private String id;
    private String name;
    private String surname;
    private String email;
    private Address address;
    private String phone;
    private boolean campaignMessageActive;

    //relations
    private List<Advert> adverts = new ArrayList<>();
    private List<Advert> favoriteAdverts = new ArrayList<>();
    private List<Search> savedSearches = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    public User(
            String name,
            String surname,
            String email,
            Address address,
            String phone,
            boolean campaignMessageActive
    ){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.campaignMessageActive = campaignMessageActive;
    }
}
