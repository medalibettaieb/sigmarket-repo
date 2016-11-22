package tn.esprit.sigma.sigmarket.services.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.sigma.sigmarket.persistence.Product;

@Local
public interface ProductServicesLocal {
	void saveOrUpdate(Product product);

	Product findProductById(Integer idProduct);

	void addProductWithProvider(Product product, Integer idProvider);

	void addProductWithProviderSlaveSide(Product product, Integer idProvider);
	
	List<Product> findAllProducts();
}
