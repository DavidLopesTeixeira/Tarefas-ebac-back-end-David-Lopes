
package br.com.candido.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.candido.dao.IClienteDAO;
import br.com.candido.domain.Cliente;
import br.com.candido.exceptions.DAOException;
import br.com.candido.exceptions.MaisDeUmRegistroException;
import br.com.candido.exceptions.TableException;
import br.com.candido.services.generic.GenericService;

@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
