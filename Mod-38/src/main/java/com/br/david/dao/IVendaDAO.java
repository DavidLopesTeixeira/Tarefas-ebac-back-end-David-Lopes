package com.br.david.dao;

import com.br.david.dao.generic.IGenericDAO;
import com.br.david.domain.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

	void finalizarVenda(Venda venda);

	void cancelarVenda(Venda venda);

	Venda consultarComCollection(Long id);

}
