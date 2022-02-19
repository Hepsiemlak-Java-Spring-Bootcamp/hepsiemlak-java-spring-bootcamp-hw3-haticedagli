package com.hepsiemlak.client.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    private String to;
    private String message;
}
