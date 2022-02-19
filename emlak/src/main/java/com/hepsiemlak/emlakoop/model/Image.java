package com.hepsiemlak.emlakoop.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Image {
    private String id;
    private String name;
    private String path;
    private String format;
    private Integer size;

    public Image(
        String name,
        String format,
        Integer size
    ){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.path = "/home/images/" + this.id;
        this.format = format;
        this.size = size;
    }
}
