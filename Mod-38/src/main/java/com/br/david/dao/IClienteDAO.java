package com.br.david.dao;

import java.util.List;

import com.br.david.dao.generic.IGenericDAO;
import com.br.david.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	List<Cliente> filtrarClientes(String query);

}
