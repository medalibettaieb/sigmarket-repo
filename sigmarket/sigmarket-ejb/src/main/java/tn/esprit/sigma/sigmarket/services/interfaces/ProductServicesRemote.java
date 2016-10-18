package tn.esprit.sigma.sigmarket.services.interfaces;

import javax.ejb.Remote;

import tn.esprit.sigma.sigmarket.persistence.Product;

@Remote
public interface ProductServicesRemote {
	void addProduct(Product product);

	Product findProductById(Integer idProduct);

	void addProductWithProvider(Product product, Integer idProvider);

	void updateProduct(Product product);

	void addProductWithProviderSlaveSide(Product product, Integer idProvider);
}
