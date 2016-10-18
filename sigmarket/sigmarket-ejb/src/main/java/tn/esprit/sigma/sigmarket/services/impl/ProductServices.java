package tn.esprit.sigma.sigmarket.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.sigma.sigmarket.persistence.Product;
import tn.esprit.sigma.sigmarket.services.interfaces.ProductServicesLocal;
import tn.esprit.sigma.sigmarket.services.interfaces.ProductServicesRemote;

/**
 * Session Bean implementation class ProductServices
 */
@Stateless
public class ProductServices implements ProductServicesRemote, ProductServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ProductServices() {
	}

	@Override
	public void addProduct(Product product) {
		entityManager.merge(product);
	}

	@Override
	public Product findProductById(Integer idProduct) {
		return entityManager.find(Product.class, idProduct);
	}

}
