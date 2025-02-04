package br.com.david.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BRAND")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_BRAND")
	@SequenceGenerator(name = "CAR_BRAND", sequenceName = "SQ_BRAND", initialValue = 1, allocationSize = 1)
	private long id;

	@Column(name = "NAME", length = 50, nullable = false, unique = true)
	private String name;

	@Column(name = "CODE", length = 10, nullable = false, unique = true)
	private String code;

	@OneToMany(mappedBy = "brand")
	private List<Car> cars;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

}
