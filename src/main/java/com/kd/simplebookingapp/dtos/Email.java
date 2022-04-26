package com.kd.simplebookingapp.dtos;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Email {
    private String from;
    private String to;
    private String subject;
    private String message;

    public Email() {
    }

    public Email(String from, String to, String subject, String message) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }
}
