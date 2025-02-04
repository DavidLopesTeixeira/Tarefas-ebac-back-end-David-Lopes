package br.com.rpires;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Assert;

import br.com.rpires.dao.ClienteDAO;
import br.com.rpires.dao.generic.jdbc.ConnectionFactory;
import br.com.rpires.domain.Cliente;
import br.com.rpires.exceptions.DAOException;
import br.com.rpires.exceptions.MaisDeUmRegistroException;
import br.com.rpires.exceptions.TableException;
import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

public class ProgramTest {

	public static void main(String[] args) throws TipoChaveNaoEncontradaException, DAOException, MaisDeUmRegistroException, TableException {
		try {
			Connection conn = ConnectionFactory.getConnection();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		Cliente cliente = new Cliente();
		ClienteDAO clienteDao = new ClienteDAO();
		/*cliente.setCpf(12312312312L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		cliente.setIdade(30);
		clienteDao.cadastrar(cliente);
		System.out.println(cliente.getNome());*/
		//clienteDao.excluir(cliente.getCpf());
		Cliente clienteConsultado = clienteDao.consultar(12312312312L);
				
		clienteConsultado.setNome("Rodrigo Pires");
		clienteDao.alterar(clienteConsultado);
		Cliente clienteAlterado = clienteDao.consultar(clienteConsultado.getCpf());
		System.out.println(clienteAlterado.getNome());
	}

}
