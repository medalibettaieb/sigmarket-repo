package tn.esprit.sigma.sigmarket.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.sigma.sigmarket.persistence.Product;
import tn.esprit.sigma.sigmarket.persistence.PurchaseDetail;
import tn.esprit.sigma.sigmarket.persistence.User;
import tn.esprit.sigma.sigmarket.services.interfaces.ProductServicesLocal;
import tn.esprit.sigma.sigmarket.services.interfaces.PurchaseManagementLocal;
import tn.esprit.sigma.sigmarket.services.interfaces.PurchaseManagementRemote;
import tn.esprit.sigma.sigmarket.services.interfaces.UserServicesLocal;

/**
 * Session Bean implementation class PurchaseManagement
 */
@Stateless
public class PurchaseManagement implements PurchaseManagementRemote, PurchaseManagementLocal {
	@PersistenceContext
	private EntityManager entityManager;
	@EJB
	private UserServicesLocal userServicesLocal;
	@EJB
	private ProductServicesLocal productServicesLocal;

	/**
	 * Default constructor.
	 */
	public PurchaseManagement() {
	}

	@Override
	public void purchase(Integer idCustomer, Integer idProduct, Integer quantity) {
		User customer = userServicesLocal.findUserById(idCustomer);
		Product product = productServicesLocal.findProductById(idProduct);
		PurchaseDetail purchaseDetail = new PurchaseDetail(quantity, customer, product);

		entityManager.merge(purchaseDetail);

	}

}
