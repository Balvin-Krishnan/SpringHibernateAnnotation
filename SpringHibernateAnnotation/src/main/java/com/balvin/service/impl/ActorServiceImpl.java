package com.balvin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balvin.dao.ActorDAO;
import com.balvin.entity.Actor;
import com.balvin.service.ActorService;

@Service("actorService")
public class ActorServiceImpl implements ActorService{

	@Autowired
	private ActorDAO actorDAO;
	public Actor findActorByActorId(int actorId) {
		return actorDAO.findActorByActorId(actorId);
	}

}
