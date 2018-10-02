package com.example.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Team {
/*
 * if you want to add the Springdata JPA features then just include @Entity,@Id @GeneratedValue,	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teamId") to your code. you can also check in Players.java for reference.  
 */
	
	@Id @GeneratedValue
	Long id;
	String name;
	String location;
	String mascott;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teamId")
	Set<Player> players;
	
	
	public Team() 
	{
		super();
	}
	
	public Team(String location,String name, Set<Player> players) {
		this();
		this.location = location;
		this.name = name;
		this.players = players;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascott() {
		return mascott;
	}
	public void setMascott(String mascott) {
		this.mascott = mascott;
	}

	
}
