package br.com.davidlopes;

import br.com.davidlopes.dao.IContratoDao;
import br.com.davidlopes.dao.mocks.ContratoDaoMock;
import br.com.davidlopes.service.ContratoService;
import br.com.davidlopes.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;


public class ContratoServiceTest {

	@Test
	// passou
	public void salvarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}

	@Test
	// passou
	public void buscarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.buscar();
		Assert.assertEquals("Retornado", retorno);
	}

	@Test
	// passou
	public void excluirTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir();
		Assert.assertEquals("Excluído", retorno);
	}

	@Test
	// passou
	public void atualizarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.atualizar();
		Assert.assertEquals("Atualizado", retorno);
	}

}
