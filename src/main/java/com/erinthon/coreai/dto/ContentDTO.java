package com.erinthon.coreai.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ContentDTO implements Serializable {

    private String title;
    private String body;

}
