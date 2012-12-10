package com.habuma.ttt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddDweetController {
	private static final Logger logger = LoggerFactory.getLogger(AddDweetController.class);
	private final DweetRepository dweetRepository;

	public AddDweetController(DweetRepository dweetRepository) {
		this.dweetRepository = dweetRepository;
	}
	
	@RequestMapping(value="/dweets", method=RequestMethod.POST)
	public String addDweet(String message) {
		logger.info("adding dweet...");
		dweetRepository.saveDweet(message);
		return "redirect:/dweets";
	}
	
}
