package com.saigonbpo.wsqc.Common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.saigonbpo.wsqc.Mapper.ReeResultMapper;
import com.saigonbpo.wsqc.Mapper.ReeWatchMapper;
import com.saigonbpo.wsqc.Model.ReeResult;
import com.saigonbpo.wsqc.Model.ReeResultExample;
import com.saigonbpo.wsqc.Model.ReeWatch;
import com.saigonbpo.wsqc.Model.ReeWatchExample;

@Component
public class Watcher extends TextWebSocketHandler {
	@Autowired
	private SimpMessagingTemplate messagingTemplate;

	@Autowired
	ReeResultMapper reeResultMapper;
	
	@Autowired
	ReeWatchMapper reeWatchMapper;
	



	public void Watcher(WebSocketSession session, TextMessage message) {
		// Handle incoming messages if needed
	}

	@EventListener(ApplicationReadyEvent.class)
	@Scheduled(fixedRate = 5000) // Update data every 5 seconds (adjust as needed)
	public void sendScheduledData() {
		// Fetch data from a source
		System.out.println("Pass Schedule");
		List<ReeResult> responseData = fetchData(); 
		messagingTemplate.convertAndSend("/topic/fetchDataResult", responseData);
		
		List<ReeWatch> responseDataWatch = fetchDataWatch();
		messagingTemplate.convertAndSend("/topic/fetchDataWatch", responseDataWatch);
		
		
		int UnNormal = reeResultMapper.countUnNormal();
		messagingTemplate.convertAndSend("/topic/fetchStatic",String.format("UnNormal: %s, Normal: %s", UnNormal, 21-UnNormal) );
	}

	private List<ReeResult> fetchData() {
		// Implement your data fetching logic here
		ReeResultExample example = new ReeResultExample();
		example.createCriteria();
		example.setOrderByClause("id desc");
		return reeResultMapper.selectByExample(example);
	}
	
	private List<ReeWatch> fetchDataWatch() {
		// Implement your data fetching logic here
		ReeWatchExample example = new ReeWatchExample();
		example.createCriteria();
		example.setOrderByClause("id desc");
		return reeWatchMapper.selectByExample(example);
	}
}
