import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.david.dao.IProdutoDao;
import br.com.david.dao.ProdutoDao;
import br.com.david.domain.Curso;
import br.com.david.domain.Produto;

/**
 * 
 */

/**
 * @author David
 *
 */
public class ProdutoTest {
	private IProdutoDao produtoDao;

	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}

	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setCodigo("P1");
		produto.setDescricao("produto teste");
		produto.setNome("apostila do curso");
		produto = produtoDao.cadastrar(produto);
		assertNotNull(produto);
		assertNotNull(produto.getId());
		

	}
}
