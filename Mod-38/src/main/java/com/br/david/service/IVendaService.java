package com.br.david.service;

import com.br.david.dao.generic.IGenericDAO;
import com.br.david.domain.Venda;

public interface IVendaService extends IGenericDAO<Venda, Long> {

	public void finalizarVenda(Venda venda);

	public void cancelarVenda(Venda venda);

	public Venda consultarComCollection(Long id);

}
