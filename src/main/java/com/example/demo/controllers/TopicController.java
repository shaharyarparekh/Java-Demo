package com.example.demo.controllers;


import com.example.demo.APIResponse;
import com.example.demo.dto.TopicDto;
import com.example.demo.models.Topic;
import com.example.demo.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService _topicService;

    @RequestMapping(value = "/")
    public String GetHelloWorld()
    {
        return "Hello World";
    }
    @RequestMapping(value = "/topics/{page}/{perPage}/{sort}")
    public List<Topic> GetAllTopics(@PathVariable int page, @PathVariable int perPage, @PathVariable String sort)
    {
        TopicDto requestDto = new TopicDto(sort,"",page,perPage);
        Page topics =  _topicService.getAllTopics(requestDto);
        return topics.getContent();
    }
    @RequestMapping(method = RequestMethod.POST ,value = "/addtopic")
    public void AddTopics(@RequestBody Topic topic)
    {
        _topicService.addTopics(topic);
    }

}
