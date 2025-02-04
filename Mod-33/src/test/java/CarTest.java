import org.junit.Test;

import br.com.douglas.dao.CarDao;
import br.com.douglas.dao.ICarDao;
import br.com.douglas.domain.Car;

public class CarTest {

	private ICarDao carDao;

	public CarTest() {
		carDao = new CarDao();
	}

	@Test
	public void cadastrar() {
		Car car = new Car();
		car.setCode("A1");
		car.setModel("Civic");
		
	}
}
