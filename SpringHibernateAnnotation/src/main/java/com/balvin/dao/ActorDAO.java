package com.balvin.dao;

import com.balvin.entity.Actor;

public interface ActorDAO {
	public Actor findActorByActorId(int ActorId);
	public void saveActor(Actor actor);
}
