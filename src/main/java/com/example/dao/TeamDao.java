package com.example.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.domain.Team;


@RestResource(path="teams",rel="teams")
/*
 * If you want to add the REST interface then just add the above annotation to your interface.
 */
public interface TeamDao extends CrudRepository<Team, Long> {

	List<Team> findAll();
	Team findByName(String name);
}
