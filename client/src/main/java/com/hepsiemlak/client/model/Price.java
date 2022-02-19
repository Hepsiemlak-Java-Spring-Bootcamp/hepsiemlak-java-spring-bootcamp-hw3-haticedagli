package com.hepsiemlak.client.model;

import com.hepsiemlak.client.enums.Currency;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Price {
    private Integer value;
    private Currency currency;

    public Price(
            Integer value,
            Currency currency
    ){
        this.value = value;
        this.currency = currency;
    }
}
