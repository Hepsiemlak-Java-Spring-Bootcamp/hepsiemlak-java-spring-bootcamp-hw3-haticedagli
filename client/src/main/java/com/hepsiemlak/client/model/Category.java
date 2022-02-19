package com.hepsiemlak.client.model;

import com.hepsiemlak.client.enums.EstateType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Category {
    private String id;
    private EstateType estateType;
    private String name;

    public Category(
            EstateType estateType,
            String name
    ){
        this.id = UUID.randomUUID().toString();
        this.estateType = estateType;
        this.name = name;
    }
}
