package com.br.david.service;

import java.util.List;

import javax.inject.Inject;

import com.br.david.dao.IProdutoDAO;
import com.br.david.domain.Produto;
import com.br.david.service.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
