package main.java.br.com.rpires.dao.generic.jdbc.dao;

import java.util.List;

import main.java.br.com.rpires.domin.Produto;

/***
 * 
 * @author David
 *
 */
public interface IProdutoDAO {

	public Integer cadastrar(Produto produto) throws Exception;

	public Integer atualizar(Produto produto) throws Exception;

	public Produto buscar(String codigo) throws Exception;

	public List<Produto> buscarTodos() throws Exception;

	public Integer excluir(Produto produto) throws Exception;

	public Integer excluirTodos() throws Exception;

}
