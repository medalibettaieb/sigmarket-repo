package tn.esprit.sigma.sigmarket.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.sigma.sigmarket.persistence.Product;

@Remote
public interface ProductServicesRemote {
	void saveOrUpdate(Product product);

	Product findProductById(Integer idProduct);

	void addProductWithProvider(Product product, Integer idProvider);

	void addProductWithProviderSlaveSide(Product product, Integer idProvider);

	List<Product> findAllProducts();
}
