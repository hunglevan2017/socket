package com.saigonbpo.wsqc.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.saigonbpo.wsqc.Mapper.ReeResultMapper;
import com.saigonbpo.wsqc.Model.ReeResult;
import com.saigonbpo.wsqc.Model.ReeResultExample;

/**
 * 
 * @author hyhd
 *
 *         The rest controller for DC user 1. check in 2. check out 3. update
 *         tracking location
 * 
 */
@Controller
public class AceCtrl {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	@GetMapping("/ace")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index.html");
		return mav;
	}

}
