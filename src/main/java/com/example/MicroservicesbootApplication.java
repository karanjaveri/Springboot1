package com.example;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.example.dao.TeamDao;
import com.example.domain.Player;
import com.example.domain.Team;

@SpringBootApplication
public class MicroservicesbootApplication extends SpringBootServletInitializer {

	
	/*
	 * used when run as JAR
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesbootApplication.class, args);
	}

	/*
	 * used when run as WAR
	 */
	/*
	 * used when run as WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(MicroservicesbootApplication.class);
	}
	
	@PostConstruct
	public void init() {
		
		Set<Player> players=new HashSet<>();
		players.add(new Player("Thomas","pitcher"));
		players.add(new Player("Jackson","shortstop"));
		Team team=new Team("California", "Peanuts",players);
		teamDao.save(team);
	}
	
	@Autowired TeamDao teamDao;
	
	
	
	
}
