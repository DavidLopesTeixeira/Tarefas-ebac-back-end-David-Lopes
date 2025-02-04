
package br.com.candido.dao.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.candido.domain.Persistente;
import br.com.candido.exceptions.DAOException;
import br.com.candido.exceptions.MaisDeUmRegistroException;
import br.com.candido.exceptions.TableException;
import br.com.candido.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
