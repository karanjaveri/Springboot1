package com.example;


import java.util.HashSet;

import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Player;
import com.example.domain.Team;

@RestController
public class hithere {
	
	private Team team;
	@PostConstruct
	public void init() {
		
		Set<Player> players=new HashSet<>();
		players.add(new Player("Thomas","pitcher"));
		players.add(new Player("Jackson","shortstop"));
		team=new Team("California", "Peanuts",players);
		
	}

	@RequestMapping("/hi")
	public Team hiThere()
	{
		return team;
	}
}
