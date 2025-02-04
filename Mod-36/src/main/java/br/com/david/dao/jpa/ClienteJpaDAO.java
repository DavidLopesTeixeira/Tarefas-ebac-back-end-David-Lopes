
package main.java.br.com.david.dao.jpa;

import main.java.br.com.david.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.david.david.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
