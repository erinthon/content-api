package com.erinthon.coreai.dto;

import lombok.Data;

@Data
public class Message {

    private String role;
    private String content;

    public Message() {
        // Construtor padrão vazio
    }

    public Message(String user, String prompt) {
        this.role = user;
        this.content = prompt;
    }
}
