package com.habuma.ttt;

import java.util.List;

public interface DweetRepository {

	List<Dweet> findRecentDweets();

	void saveDweet(String message);
	
}
