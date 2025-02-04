import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.david.dao.BrandDao;
import br.com.david.dao.IBrandDao;
import br.com.david.domain.Brand;

public class BrandTest {
	private IBrandDao brandDao;

	public BrandTest() {
		brandDao = new BrandDao();

	}

	@Test
	public void cadastrar() {
		Brand brand = new Brand();
		brand.setCode("A1");
		brand.setName("Honda");

		brand = brandDao.register(brand);
		assertNotNull(brand);
		assertNotNull(brand.getId());
		assertNotNull(brand.getCode());
		assertNotNull(brand.getName());
	}
}
