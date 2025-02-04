package br.com.david.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CAR")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CAR")
	@SequenceGenerator(name = "CAR_SEQ", sequenceName = "SQ_CAR", initialValue = 1, allocationSize = 1)
	private long id;

	@Column(name = "MODEL", length = 50, nullable = false, unique = true)
	private String model;

	@Column(name = "CODE", length = 10, nullable = false, unique = true)
	private String code;

	@ManyToOne()
	@JoinColumn(name = "ID_BRAND_FK", foreignKey = @ForeignKey(name = "FK_BRAND_CAR"), referencedColumnName = "ID", nullable = false)
	private Brand brand;

	@OneToMany(mappedBy = "car")
	private List<Accessory> accessories;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public List<Accessory> getAccessories() {
		return accessories;
	}

	public void setAccessories(List<Accessory> accessories) {
		this.accessories = accessories;
	}

	public Car() {
		this.accessories = new ArrayList<Accessory>();

	}

	public void add(Accessory accessory) {
		this.accessories.add(accessory);
	}

}
