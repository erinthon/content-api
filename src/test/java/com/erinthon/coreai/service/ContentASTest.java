package com.erinthon.coreai.service;

import com.erinthon.coreai.dto.ContentDTO;
import com.erinthon.coreai.model.Content;
import com.erinthon.coreai.repository.ContentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ContentASTest {

    @Mock
    private ContentRepository contentRepository;

    @InjectMocks
    private ContentAS contentAS;

    @Test
    void createContent_savesEntityAndReturnsDtoWithId() {
        ContentDTO inputDto = new ContentDTO();
        inputDto.setTitle("Title");
        inputDto.setBody("Body");

        Content savedContent = new Content();
        savedContent.setId(1L);
        savedContent.setTitle("Title");
        savedContent.setBody("Body");

        when(contentRepository.save(any(Content.class))).thenReturn(savedContent);

        ContentDTO result = contentAS.createContent(inputDto);

        ArgumentCaptor<Content> captor = ArgumentCaptor.forClass(Content.class);
        verify(contentRepository).save(captor.capture());
        Content captured = captor.getValue();
        assertThat(captured.getId()).isNull();
        assertThat(captured.getTitle()).isEqualTo("Title");
        assertThat(captured.getBody()).isEqualTo("Body");

        assertThat(result.getId()).isEqualTo(1L);
        assertThat(result.getTitle()).isEqualTo("Title");
        assertThat(result.getBody()).isEqualTo("Body");
    }
}
