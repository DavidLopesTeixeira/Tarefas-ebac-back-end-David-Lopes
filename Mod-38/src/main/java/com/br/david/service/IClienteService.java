package com.br.david.service;

import java.util.List;

import com.br.david.domain.Cliente;
import com.br.david.exceptions.DAOException;
import com.br.david.service.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
