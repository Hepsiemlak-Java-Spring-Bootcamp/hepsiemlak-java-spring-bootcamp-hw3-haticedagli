package com.hepsiemlak.emlakoop.model;

import com.hepsiemlak.emlakoop.enums.Currency;
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
