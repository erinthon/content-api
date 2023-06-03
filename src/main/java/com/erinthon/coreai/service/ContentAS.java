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

    public ContentDTO createContent(ContentDTO contentDTO) {
        Content content = new Content();
        content.setTitle(contentDTO.getTitle());
        content.setBody(contentDTO.getBody());

        content = contentRepository.save(content);

        ContentDTO createdContentDTO = new ContentDTO();
        createdContentDTO.setId(content.getId());
        createdContentDTO.setTitle(content.getTitle());
        createdContentDTO.setBody(content.getBody());

        return createdContentDTO;
    }

    public List<Content> listAll() {
        return contentRepository.findAll();
    }

    public void updateContent(ContentDTO contentDTO) {
        Content content = contentRepository.findById(contentDTO.getId()).orElseThrow(() -> new RuntimeException("Content not found"));
        content.setTitle(contentDTO.getTitle());
        content.setBody(contentDTO.getBody());

        contentRepository.save(content);
    }

    public void deleteContent(ContentDTO contentDTO) {
        Content content = contentRepository.findById(contentDTO.getId()).orElseThrow(() -> new RuntimeException("Content not found"));
        contentRepository.delete(content);
    }
}