package com.saigonbpo.wsqc.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class AceCtrl {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ReeResultMapper reeResultMapper;

	@GetMapping(value = "/ace", produces = { "application/json;charset=UTF-8" })
	public ReeResult ace() {

		ReeResultExample example = new ReeResultExample();
		example.createCriteria();
		example.setOrderByClause("id desc");
		return reeResultMapper.selectByExample(example).get(0);
	}



}
