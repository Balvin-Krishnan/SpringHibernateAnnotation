package com.balvin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FilmActorPK implements Serializable {
	
	@Column(name="actor_id", insertable=false, updatable=false, nullable=false, unique=true)
	private int actorId;
	
	@Column(name="film_id", insertable=false, updatable=false, nullable=false, unique=true)
	private int filmId;

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
}
