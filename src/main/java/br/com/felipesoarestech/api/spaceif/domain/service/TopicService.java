package br.com.felipesoarestech.api.spaceif.domain.service;

import br.com.felipesoarestech.api.spaceif.domain.dto.TopicRequestDTO;
import br.com.felipesoarestech.api.spaceif.domain.model.Topic;
import br.com.felipesoarestech.api.spaceif.domain.repository.TopicRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    @Autowired
    TopicRepository topicRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<Topic> save(TopicRequestDTO topic){
        Topic topicSave = topicRepository.save(new Topic(topic));
        return ResponseEntity.status(HttpStatus.CREATED).body(topicSave);
    }
}
