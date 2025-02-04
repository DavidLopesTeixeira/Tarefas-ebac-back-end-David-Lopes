import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.douglas.dao.BrandDao;
import br.com.douglas.dao.IBrandDao;
import br.com.douglas.domain.Brand;

public class TestBrand {
	private IBrandDao brandDao;

	public TestBrand() {
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
