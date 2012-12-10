package com.habuma.ttt;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * New Controller class that provides showDweets and addDweet methods
 * @author rodvina
 *
 */
@Controller
@RequestMapping(value="/dweets")
public class DweetController {
	private static final Logger logger = LoggerFactory.getLogger(DweetController.class);
	private final DweetRepository dweetRepository;

	@Autowired
	public DweetController(DweetRepository dweetRepository) {
		logger.info("DweetController:  repository injected...");
		this.dweetRepository = dweetRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String showDweets(Model model) {
		logger.info("showDweets...");
		List<Dweet> recentDweets = dweetRepository.findRecentDweets();
		model.addAttribute(recentDweets);
		return "dweetList";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addDweet(String message) {
		dweetRepository.saveDweet(message);
		return "redirect:/dweets";
	}
}
