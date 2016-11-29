package tn.esprit.sigma.sigmarket.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity

public class Category implements Serializable {
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy="category")
	private List<Product> products;

	private static final long serialVersionUID = 1L;

	public Category() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
