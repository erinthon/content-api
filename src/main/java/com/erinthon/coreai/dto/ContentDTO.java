package com.erinthon.coreai.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ContentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private String body;

}
