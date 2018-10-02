package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.domain.Player;


@RestResource(path="players",rel="players")
public interface Playerdao extends CrudRepository<Player, Long> {

}
