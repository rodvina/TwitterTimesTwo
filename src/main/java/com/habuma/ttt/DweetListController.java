package com.habuma.ttt;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DweetListController {
	private static final Logger logger = LoggerFactory.getLogger(DweetListController.class);

	private final DweetRepository dweetRepository;

	public DweetListController(DweetRepository dweetRepository) {
		this.dweetRepository = dweetRepository;
	}
	
	@RequestMapping(value="/dweets", method=RequestMethod.GET)
	public String showDweets(Model model) {
		logger.info("showing dweet...");
		List<Dweet> recentDweets = dweetRepository.findRecentDweets();
		model.addAttribute(recentDweets);
		return "dweetList";
	}
	
}
