package com.springcore.sterotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sports {
	
	@Value("Cricket")
	private String name;
	
	@Value("11")
	private int players;
	
	@Value("#{teams}")
	private List<String> teams;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayers() {
		return players;
	}

	public void setPlayers(int players) {
		this.players = players;
	}

	public List<String> getTeams() {
		return teams;
	}

	public void setTeams(List<String> teams) {
		this.teams = teams;
	}

	@Override
	public String toString() {
		return "Sports [name=" + name + ", players=" + players + "]";
	}
	
	
}
