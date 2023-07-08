package com.erinthon.coreai.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ChatRequest {

    @JsonProperty("model")
    private String model;

    @JsonProperty("messages")
    private List<Message> messages;

    @JsonProperty("n")
    private int n;

    @JsonProperty("temperature")
    private double temperature;

    public ChatRequest(String model, String prompt) {
        this.model = model;
        this.n = 1;

        this.messages = new ArrayList<>();
        this.messages.add(new Message("user", prompt));
    }
}
