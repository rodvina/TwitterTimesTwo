package com.habuma.ttt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;

public class JdbcDweetRepository implements DweetRepository {
	
	private final JdbcOperations jdbc;

	public JdbcDweetRepository(JdbcOperations jdbc) {
		this.jdbc = jdbc;
	}
	
	public List<Dweet> findRecentDweets() {
		return jdbc.query("SELECT id, message, time_stamp FROM dweet ORDER BY time_stamp DESC", 
			new RowMapper<Dweet>() {
				public Dweet mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new Dweet(rs.getLong("id"), rs.getString("message"), rs.getTimestamp("time_stamp"));
				}
			});
	}
	
	public void saveDweet(String message) {
		jdbc.update("INSERT INTO dweet (message, time_stamp) VALUES (?, ?)", message, new Date());
	}
	
}
