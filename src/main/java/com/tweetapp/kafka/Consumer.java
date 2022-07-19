//package com.tweetapp.kafka;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class Consumer {
//	private final Logger logger = LoggerFactory.getLogger(this.getClass());
//	@KafkaListener(topics = "tweet", groupId = "MyGroup	")
//	public String listen(String message) {
//		logger.info("Received Messasge in group - MyGroup: " + message);
//		return "message received:"+message;
//	   
//	}
//
//}
