package com.habuma.ttt;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class InMemoryDweetRepository implements DweetRepository {

	private List<Dweet> dweets;
	
	public List<Dweet> findRecentDweets() {
		System.out.println("Finding dweets");
		return Collections.unmodifiableList(dweets);
	}

	public void saveDweet(String message) {
		System.out.println("Dweeting : " + message);
		dweets.add(new Dweet(dweets.size(), message, new Date()));
	}

}
