package com.erinthon.coreai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ContentController {

    @GetMapping
    public String index() {
        return "Hello World!";
    }



}
