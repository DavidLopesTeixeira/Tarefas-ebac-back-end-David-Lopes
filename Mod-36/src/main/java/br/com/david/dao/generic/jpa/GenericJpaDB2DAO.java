
package main.java.br.com.david.dao.generic.jpa;

import java.io.Serializable;

import main.java.br.com.david.david.jpa.Persistente;

public abstract class GenericJpaDB2DAO<T extends Persistente, E extends Serializable> extends GenericJpaDAO<T, E> {

	public GenericJpaDB2DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre2");
	}

}
