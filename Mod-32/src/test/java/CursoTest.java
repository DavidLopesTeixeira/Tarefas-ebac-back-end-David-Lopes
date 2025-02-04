import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.david.dao.CursoDao;
import br.com.david.dao.ICursoDao;
import br.com.david.domain.Curso;

public class CursoTest {

	private ICursoDao cursoDao;

	public CursoTest() {
		cursoDao = new CursoDao();
	}

	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("curso teste");
		curso.setNome("curso de java");
		curso = cursoDao.cadastrar(curso);
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}
}
