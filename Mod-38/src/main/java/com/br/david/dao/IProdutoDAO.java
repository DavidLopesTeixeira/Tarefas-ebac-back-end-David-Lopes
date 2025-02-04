package com.br.david.dao;

import java.util.List;

import com.br.david.dao.generic.IGenericDAO;
import com.br.david.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
