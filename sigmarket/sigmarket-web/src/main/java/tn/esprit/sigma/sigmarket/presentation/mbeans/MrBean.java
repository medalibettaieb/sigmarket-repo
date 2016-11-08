package tn.esprit.sigma.sigmarket.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import tn.esprit.sigma.sigmarket.persistence.Product;
import tn.esprit.sigma.sigmarket.services.interfaces.ProductServicesLocal;

@ManagedBean
public class MrBean {
	// models
	private Product product = new Product();
	// dependency injection
	@EJB
	private ProductServicesLocal productServicesLocal;

	// methods or recall
	public String doAddProduct() {
		productServicesLocal.addProduct(product);
		return "";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
