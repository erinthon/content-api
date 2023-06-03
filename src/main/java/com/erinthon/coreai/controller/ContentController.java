package com.erinthon.coreai.controller;

import com.erinthon.coreai.dto.ContentDTO;
import com.erinthon.coreai.model.Content;
import com.erinthon.coreai.service.ContentAS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {

    private final ContentAS contentAS;

    @Autowired
    public ContentController(ContentAS contentAS) {
        this.contentAS = contentAS;
    }

    @GetMapping
    public List<Content> listAll() {
        return contentAS.listAll();
    }

    @PostMapping("/create")
    public ContentDTO create(@RequestBody ContentDTO contentDTO) {
        contentAS.createContent(contentDTO);

        return contentDTO;
    }

    @PutMapping("/update")
    public ContentDTO update(@RequestBody ContentDTO contentDTO) {
        contentAS.updateContent(contentDTO);

        return contentDTO;
    }

    @DeleteMapping("/delete")
    public ContentDTO delete(@RequestBody ContentDTO contentDTO) {
        contentAS.deleteContent(contentDTO);

        return contentDTO;
    }
}