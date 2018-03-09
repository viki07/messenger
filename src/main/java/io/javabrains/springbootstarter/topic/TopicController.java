package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicSrevice topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		return topicService.getAllTopic();		
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=org.springframework.web.bind.annotation.RequestMethod.POST , value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);		
	}
	
	@RequestMapping(method=org.springframework.web.bind.annotation.RequestMethod.PUT , value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic ,@PathVariable String id) {
		topicService.updateTopic(id,topic);		
	}
	
}
