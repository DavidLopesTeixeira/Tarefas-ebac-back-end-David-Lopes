package br.com.david.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.david.domain.Accessory;

public class AccessoryDao implements IAccessoryDao{

	@Override
	public Accessory register(Accessory accessory) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(accessory);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
		return accessory;
	}

}
