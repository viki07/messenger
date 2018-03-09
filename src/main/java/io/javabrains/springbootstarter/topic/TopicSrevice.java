package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicSrevice {

	private  List<Topic> topics = new ArrayList<>( Arrays.asList(
			new Topic("spring1","spring framework1","spring frame work description1"),
			new Topic("spring2","spring framework2","spring frame work description2"),
			new Topic("spring3","spring framework3","spring frame work description3")				
			));

	public List<Topic> getAllTopic() {
		return  topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {	
		topics.add(topic);		
	}

	public void updateTopic(String id,Topic topic) {
		
		for(int i=0;i< topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}
}
