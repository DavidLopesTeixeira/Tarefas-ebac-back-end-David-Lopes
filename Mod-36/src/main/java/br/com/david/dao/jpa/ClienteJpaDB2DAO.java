
package main.java.br.com.david.dao.jpa;

import main.java.br.com.david.dao.generic.jpa.GenericJpaDB2DAO;
import main.java.br.com.david.david.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
