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
	//Adding some comments
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
	
	public void saveActor(Actor actor) {
		EntityManager entityManager = this.emf.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(actor);
		entityManager.persist(actor);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
