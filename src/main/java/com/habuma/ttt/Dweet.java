package com.habuma.ttt;

import java.util.Date;

public class Dweet {

	private final long id;
	
	private final String message;
	
	private final Date timestamp;
	
	public long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public Dweet(long id, String message, Date timestamp) {
		this.id = id;
		this.message = message;
		this.timestamp = timestamp;
	}
	
}
