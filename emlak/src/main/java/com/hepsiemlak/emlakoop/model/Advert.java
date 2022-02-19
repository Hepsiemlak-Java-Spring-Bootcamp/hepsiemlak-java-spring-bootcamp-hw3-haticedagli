package com.hepsiemlak.emlakoop.model;

import com.hepsiemlak.emlakoop.enums.Status;
import com.hepsiemlak.emlakoop.model.estate.Estate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
public class Advert {

    private String id;
    private String title;
    private String description;
    private Status status;
    private Estate estate;
    //private User owner;
    private Price price;
    boolean boost;
    private Date createdDate;
    private Date updatedDate;

    //relations
    //private List<User> favoriteBy = new ArrayList<>();

    public Advert(
            String title,
            String description,
            Estate estate,
            User owner,
            Price price,
            boolean boost
    ){
        this.id = UUID.randomUUID().toString();
        this.status = Status.PENDING;
        this.title = title;
        this.description = description;
        this.estate = estate;
        //this.owner = owner;
        this.price = price;
        this.boost = boost;
        owner.getAdverts().add(this);
    }
}
