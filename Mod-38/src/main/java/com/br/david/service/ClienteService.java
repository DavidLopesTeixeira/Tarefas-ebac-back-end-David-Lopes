package com.br.david.service;

import java.util.List;

import javax.inject.Inject;

import com.br.david.dao.IClienteDAO;
import com.br.david.domain.Cliente;
import com.br.david.exceptions.DAOException;
import com.br.david.exceptions.MaisDeUmRegistroException;
import com.br.david.exceptions.TableException;
import com.br.david.service.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	private IClienteDAO clienteDAO;

	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		return clienteDAO.filtrarClientes(query);
	}

}
