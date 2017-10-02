package com.balvin.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.balvin.dao.ActorDAO;
import com.balvin.entity.Actor;

@Repository("actorDao")
public class ActorDAOImpl implements ActorDAO{

	private EntityManagerFactory emf;
	
	@PersistenceUnit
	public void setEntityManagerFactory(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	public Actor findActorByActorId(int actorId) {
		EntityManager entityManager = this.emf.createEntityManager();
		Query query = entityManager.createQuery("from Actor where actorId = :actorId");
		query.setParameter("actorId", actorId);
		
		return (Actor)query.getSingleResult();
	}

}
