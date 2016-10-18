package tn.esprit.sigma.sigmarket.utilities;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.esprit.sigma.sigmarket.persistence.Customer;
import tn.esprit.sigma.sigmarket.persistence.Product;
import tn.esprit.sigma.sigmarket.persistence.Provider;
import tn.esprit.sigma.sigmarket.services.interfaces.ProductServicesLocal;
import tn.esprit.sigma.sigmarket.services.interfaces.UserServicesLocal;

/**
 * Session Bean implementation class Util
 */
@Singleton
@LocalBean
@Startup
public class Util {
	@EJB
	private UserServicesLocal userServicesLocal;
	@EJB
	private ProductServicesLocal productServicesLocal;

	/**
	 * Default constructor.
	 */
	public Util() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void initDB() {
		Provider provider = new Provider();
		provider.setName("chaima");
		provider.setAddress("M9");

		Customer customer = new Customer();
		customer.setName("skon");
		customer.setCredit(100F);

		Customer customer2 = new Customer();
		customer2.setName("siryne");
		customer2.setCredit(10F);

		Product product = new Product();
		product.setName("bisiqui");

		userServicesLocal.addUser(provider);
		userServicesLocal.addUser(customer);
		userServicesLocal.addUser(customer2);

		productServicesLocal.addProduct(product);
	}

}
