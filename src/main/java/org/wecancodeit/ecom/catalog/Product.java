package org.wecancodeit.ecom.catalog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Product {

	@Id
	@GeneratedValue
	private long id; 
	private String name;
	
	@SuppressWarnings("unused") //needed for Json/JPA
	private Product() {}
	
	public Product(String name) {
		this.name=name; 
	}

	public String getName() {
		return name;
	}

}
