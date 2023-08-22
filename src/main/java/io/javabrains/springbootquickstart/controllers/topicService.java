package io.javabrains.springbootquickstart.controllers;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    @Service
    public class topicService {
        private List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("Spring", "Spring Framework","Spring FrameWork Description"),
                new Topic("Java", "JavaCore Framework","Java Description"),
                new Topic("Javascript", "JavaScript Framework","JavaScript Description")
        ));
        public List<Topic> getAllTopics() {
            return topics;
        }
        public Topic getTopic(String id) {
            return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        }
        public void addTopic(Topic topic) {
            topics.add(topic);
        }
        public void updateTopic(String id, Topic topic) {
            for (int i = 0; i < topics.size(); i++) {
                Topic t = topics.get(i);
                if (t.getId().equals(id)) {
                    topics.set(i, topic);
                    return;
                }
            }
        }

}
