package br.com.pizzariamaster.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pizzaria");
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
