package br.com.david.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.david.domain.Brand;

public class BrandDao implements IBrandDao {

	@Override
	public Brand register(Brand brand) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(brand);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

		return brand;
	}

}
