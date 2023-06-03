package com.erinthon.coreai.service;

import com.erinthon.coreai.dto.ContentDTO;
import com.erinthon.coreai.model.Content;
import com.erinthon.coreai.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentAS {

    private final ContentRepository contentRepository;

    @Autowired
    public ContentAS(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public Content createContent(ContentDTO contentDTO) {
        Content content = new Content();
        content.setTitle(contentDTO.getTitle());
        content.setBody(contentDTO.getBody());

        return contentRepository.save(content);
    }

    public List<Content> listAll() {
        return contentRepository.findAll();
    }
}