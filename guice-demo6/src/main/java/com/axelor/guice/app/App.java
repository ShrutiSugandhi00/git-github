package com.axelor.guice.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.axelor.guice.entity.User;

public class App {
	
	
		public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJpaUnit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		User user = new User("firstName","lastName","username","password");
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	

	

}
