package com.example.demo.services;

import com.example.demo.dto.TopicDto;
import com.example.demo.models.Topic;
import com.example.demo.repositary.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository _topicRepository;

    public Page<Topic> getAllTopics(TopicDto requestDto)
    {

        Page topics = _topicRepository.findAll(PageRequest.of(requestDto.Page, requestDto.PerPage));
        return topics;
    }
    public void addTopics(Topic topic)
    {
        _topicRepository.save(topic);
    }


    // Delete operation
    public void deleteDepartmentById(int topicId)
    {
        _topicRepository.deleteById(topicId);
    }
}
