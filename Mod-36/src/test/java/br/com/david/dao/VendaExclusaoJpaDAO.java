/**
 *
 */
package test.java.br.com.david.dao;

import main.java.br.com.david.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.david.dao.jpa.IVendaJpaDAO;
import main.java.br.com.david.david.jpa.VendaJpa;
import main.java.br.com.david.exceptions.DAOException;
import main.java.br.com.david.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author David
 *
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
