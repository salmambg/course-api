package io.javabrains.springbootquickstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController // whatever you return is get automatically converted to json and sent back as the http response
public class topicController {

    @RequestMapping("/topics")
    public List<Topic>getAllTopics() {
        return Arrays.asList(
                new Topic("Spring", "Spring Framework","Spring FrameWork Description"),
                new Topic("Java", "JavaCore Framework","Java Description"),
                new Topic("Javascript", "JavaScript Framework","JavaScript Description")
        );
    }
}
