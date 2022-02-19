package com.hepsiemlak.emlakoop.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Address {
    private String id;
    private String province;
    private String district;
    private String neighborhood;
    private String address;

    public Address(
        String province,
        String district,
        String neighborhood,
        String address
    ){
        this.id = UUID.randomUUID().toString();
        this.province = province;
        this.district = district;
        this.neighborhood = neighborhood;
        this.address = address;
    }
}
