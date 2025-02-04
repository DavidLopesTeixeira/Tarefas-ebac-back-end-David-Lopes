
package br.com.candido.dao;

import br.com.candido.dao.generic.GenericDAO;
import br.com.candido.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
