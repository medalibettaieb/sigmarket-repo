package tn.esprit.sigma.sigmarket.services.interfaces;

import javax.ejb.Remote;

import tn.esprit.sigma.sigmarket.persistence.Product;

@Remote
public interface ProductServicesRemote {
	void addProduct(Product product);

	Product findProductById(Integer idProduct);
}
