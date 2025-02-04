package test.java.br.com.rpires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import main.java.br.com.rpires.dao.generic.jdbc.dao.IProdutoDAO;
import main.java.br.com.rpires.dao.generic.jdbc.dao.ProdutoDAO;
import main.java.br.com.rpires.domin.Produto;
/***
 * 
 * @author David
 *
 */
public class ProdutoTest {

	private IProdutoDAO produtoDAO = new ProdutoDAO();

	Produto produto = new Produto();
	Produto produto2 = new Produto();
	Produto produto1BD;
	Produto produto2BD;

	@Test
	public void testesPorOrdem() throws Exception {

		cadastrarTest();
		buscarTest();
		buscarTodosTest();
		atualizarTest();
		excluirTest();
		excluirTodosTest();

	}

	public void cadastrarTest() throws Exception {
		produto.setCodigo("10");
		produto.setNome("produto1");
		produto.setPreco(100.00);

		produto2.setCodigo("20");
		produto2.setNome("produto2");
		produto2.setPreco(200.00);
		Integer countCad = produtoDAO.cadastrar(produto);
		assertTrue(countCad == 1);

		Integer countCad2 = produtoDAO.cadastrar(produto2);
		assertTrue(countCad2 == 1);
	}

	public void buscarTest() throws Exception {
		produto1BD = produtoDAO.buscar("10");
		assertNotNull(produto1BD);
		assertEquals(produto.getCodigo(), produto1BD.getCodigo());
		assertEquals(produto.getNome(), produto1BD.getNome());
	}

	public void buscarTodosTest() throws Exception {
		produto1BD = produtoDAO.buscar("10");
		assertNotNull(produto1BD);
		produto2BD = produtoDAO.buscar("20");
		assertNotNull(produto2BD);

		List<Produto> list = produtoDAO.buscarTodos();
		assertNotNull(list);
		assertEquals(2, list.size());
	}

	public void atualizarTest() throws Exception {
		produto1BD = produtoDAO.buscar("10");
		assertNotNull(produto1BD);

		assertEquals(produto.getCodigo(), produto1BD.getCodigo());
		assertEquals(produto.getNome(), produto1BD.getNome());
		assertEquals(produto.getPreco(), produto1BD.getPreco());
		produto1BD.setCodigo("11");
		produto1BD.setNome("outro produto");
		produto1BD.setPreco(201.00);

		Integer countUpdate = produtoDAO.atualizar(produto1BD);
		assertTrue(countUpdate == 1);
	}

	public void excluirTest() throws Exception {
		produto2BD = produtoDAO.buscar("20");
		assertNotNull(produto2BD);
		Integer countDel = produtoDAO.excluir(produto2BD);
		assertTrue(countDel == 1);
	}

	public void excluirTodosTest() throws Exception {
		List<Produto> list = produtoDAO.buscarTodos();
		assertNotNull(list);

		int countDel = 0;
		for (Produto prod : list) {
			produtoDAO.excluir(prod);
			countDel++;
		}
		assertEquals(list.size(), countDel);

		list = produtoDAO.buscarTodos();
		assertEquals(list.size(), 0);
	}

}
