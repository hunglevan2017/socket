package com.saigonbpo.wsqc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.saigonbpo.wsqc.Mapper.ReeResultMapper;
import com.saigonbpo.wsqc.Model.ReeResult;
import com.saigonbpo.wsqc.Model.ReeResultExample;
import com.saigonbpo.wsqc.Model.ReeWatch;

@Controller
@RequestMapping(value = "")
public class AppCtrl {

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index.html");
		return mav;
	}
	
	@MessageMapping("/fetchstatic")
	@SendTo("/topic/fetchStatic")
	public String getstatic(String numUnNormal) throws Exception {
		Thread.sleep(1000);
		return numUnNormal;
	}
	
	@MessageMapping("/fetchDataResul")
	@SendTo("/topic/fetchDataResult")
	public List<ReeResult> getResult(List<ReeResult> reeResults) throws Exception {
		Thread.sleep(1000); 
		return reeResults;
	}
	
	@MessageMapping("/fetchWatch")
	@SendTo("/topic/fetchDataWatch")
	public List<ReeWatch> getResultWatch(List<ReeWatch> reeReeWatchs) throws Exception {
		Thread.sleep(1000); 
		return reeReeWatchs;
	}
}
