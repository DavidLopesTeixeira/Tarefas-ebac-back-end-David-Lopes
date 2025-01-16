package br.com.davidlopes.service;

import br.com.davidlopes.dao.IContratoDao;

public class ContratoService implements IContratoService {

	private IContratoDao contratoDao;

	public ContratoService(IContratoDao dao) {
		this.contratoDao = dao;
	}
	

	@Override
	public String salvar() {
		contratoDao.salvar();
		return "Sucesso";
	}

	@Override
	public String buscar() {
		// TODO Auto-generated method stub
		return "Retornado";
	}

	@Override
	public String excluir() {
		// TODO Auto-generated method stub
		return "Excluído";
	}

	@Override
	public String atualizar() {
		// TODO Auto-generated method stub
		return "Atualizado";
	}
}
