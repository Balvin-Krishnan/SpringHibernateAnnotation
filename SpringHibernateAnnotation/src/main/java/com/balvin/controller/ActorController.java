package com.balvin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balvin.entity.Actor;
import com.balvin.service.ActorService;

@RestController("/actor")
public class ActorController {
	
	@Autowired
	private ActorService actorService;
	
    @RequestMapping(//method = RequestMethod.GET,
            value = "/findByActor",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

	public Actor findActorById() {
		return actorService.findActorByActorId(2);
	}
}
