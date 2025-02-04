package test.java.br.com.rpires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import main.java.br.com.rpires.dao.generic.jdbc.dao.ClienteDAO;
import main.java.br.com.rpires.dao.generic.jdbc.dao.IClienteDAO;
import main.java.br.com.rpires.domin.Cliente;

/***
 * 
 * @author David
 *
 */
public class ClienteTest {

	private IClienteDAO clienteDAO = new ClienteDAO();

	Cliente cliente = new Cliente();
	Cliente cliente2 = new Cliente();
	Cliente cliente1BD;
	Cliente cliente2BD;

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
		cliente.setCodigo("10");
		cliente.setNome("Douglas");

		cliente2.setCodigo("20");
		cliente2.setNome("Silvia");

		Integer countCad = clienteDAO.cadastrar(cliente);
		assertTrue(countCad == 1);

		Integer countCad2 = clienteDAO.cadastrar(cliente2);
		assertTrue(countCad2 == 1);
	}

	public void buscarTest() throws Exception {
		cliente1BD = clienteDAO.buscar("10");
		assertNotNull(cliente1BD);
		assertEquals(cliente.getCodigo(), cliente1BD.getCodigo());
		assertEquals(cliente.getNome(), cliente1BD.getNome());
	}

	public void buscarTodosTest() throws Exception {
		cliente1BD = clienteDAO.buscar("10");
		assertNotNull(cliente1BD);
		cliente2BD = clienteDAO.buscar("20");
		assertNotNull(cliente2BD);

		List<Cliente> list = clienteDAO.buscarTodos();
		assertNotNull(list);
		assertEquals(2, list.size());
	}

	public void atualizarTest() throws Exception {
		cliente1BD = clienteDAO.buscar("10");
		assertNotNull(cliente1BD);

		assertEquals(cliente.getCodigo(), cliente1BD.getCodigo());
		assertEquals(cliente.getNome(), cliente1BD.getNome());

		cliente1BD.setCodigo("11");
		cliente1BD.setNome("Dev Java");

		Integer countUpdate = clienteDAO.atualizar(cliente1BD);
		assertTrue(countUpdate == 1);
	}

	public void excluirTest() throws Exception {
		cliente2BD = clienteDAO.buscar("20");
		assertNotNull(cliente2BD);
		Integer countDel = clienteDAO.excluir(cliente2BD);
		assertTrue(countDel == 1);
	}

	public void excluirTodosTest() throws Exception {
		List<Cliente> list = clienteDAO.buscarTodos();
		assertNotNull(list);

		int countDel = 0;
		for (Cliente cl : list) {
			clienteDAO.excluir(cl);
			countDel++;
		}
		assertEquals(list.size(), countDel);

		list = clienteDAO.buscarTodos();
		assertEquals(list.size(), 0);
	}

}
