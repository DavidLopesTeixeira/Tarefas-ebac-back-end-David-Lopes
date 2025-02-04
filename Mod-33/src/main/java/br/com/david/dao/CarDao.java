package br.com.david.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.david.domain.Car;

public class CarDao implements ICarDao{

	@Override
	public Car register(Car car) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(car);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
		return car;
	}

}
