package com.br.david.service;

import java.util.List;

import com.br.david.domain.Produto;
import com.br.david.service.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
