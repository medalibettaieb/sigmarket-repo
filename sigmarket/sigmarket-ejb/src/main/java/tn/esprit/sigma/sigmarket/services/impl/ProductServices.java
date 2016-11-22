package tn.esprit.sigma.sigmarket.services.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.sigma.sigmarket.persistence.Product;
import tn.esprit.sigma.sigmarket.persistence.User;
import tn.esprit.sigma.sigmarket.services.interfaces.ProductServicesLocal;
import tn.esprit.sigma.sigmarket.services.interfaces.ProductServicesRemote;
import tn.esprit.sigma.sigmarket.services.interfaces.UserServicesLocal;

/**
 * Session Bean implementation class ProductServices
 */
@Stateless
public class ProductServices implements ProductServicesRemote, ProductServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;
	@EJB
	private UserServicesLocal userServicesLocal;

	/**
	 * Default constructor.
	 */
	public ProductServices() {
	}

	@Override
	public void saveOrUpdate(Product product) {
		entityManager.merge(product);
	}

	@Override
	public Product findProductById(Integer idProduct) {
		return entityManager.find(Product.class, idProduct);
	}

	@Override
	public void addProductWithProvider(Product product, Integer idProvider) {
		User providerFound = userServicesLocal.findUserById(idProvider);
		product.setProvider(providerFound);
		saveOrUpdate(product);

	}

	@Override
	public void addProductWithProviderSlaveSide(Product product, Integer idProvider) {
		User providerFound = userServicesLocal.findUserById(idProvider);
		List<Product> oldProducts = providerFound.getProducts();
		oldProducts.add(product);
		providerFound.linkProductsToThisUser(oldProducts);

		userServicesLocal.updateUser(providerFound);

	}

	@Override
	public List<Product> findAllProducts() {
		return entityManager.createQuery("SELECT p FROM Product p", Product.class).getResultList();
	}

}
