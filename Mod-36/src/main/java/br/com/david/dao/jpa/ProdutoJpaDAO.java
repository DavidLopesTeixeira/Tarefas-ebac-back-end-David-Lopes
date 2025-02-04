/**
 *
 */
package main.java.br.com.david.dao.jpa;

import main.java.br.com.david.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.david.david.jpa.ProdutoJpa;

/**
 * @author David
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
