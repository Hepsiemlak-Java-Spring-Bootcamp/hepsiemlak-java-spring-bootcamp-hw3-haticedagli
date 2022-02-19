package com.hepsiemlak.client.model;

import com.hepsiemlak.client.enums.AttributeType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Attribute {
    private String id;
    private AttributeType attributeType;
    private String value;

    public Attribute(
            AttributeType attributeType,
            String value
    ){
        this.attributeType = attributeType;
        this.value = value;
    }
}
