package br.com.david.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ACCESSORY")
public class Accessory {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ACCESSORY")
	@SequenceGenerator(name = "CAR_ACCESSORY", sequenceName = "SQ_ACCESSORY", initialValue = 1, allocationSize = 1)
	private long id;

	@Column(name = "NAME", length = 50, nullable = false, unique = true)
	private String name;

	@Column(name = "CODE", length = 10, nullable = false, unique = true)
	private String code;

	@ManyToOne()
	@JoinColumn(name = "ID_CAR_FK", foreignKey = @ForeignKey(name = "FK_CAR_ACCESSORY"), referencedColumnName = "ID", nullable = false)
	private Car car;

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

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
