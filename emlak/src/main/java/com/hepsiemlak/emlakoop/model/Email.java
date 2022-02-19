package com.hepsiemlak.emlakoop.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    private String to;
    private String message;
}
