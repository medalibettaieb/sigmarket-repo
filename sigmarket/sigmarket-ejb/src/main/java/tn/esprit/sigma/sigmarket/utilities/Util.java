package tn.esprit.sigma.sigmarket.utilities;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.esprit.sigma.sigmarket.persistence.Customer;
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
		provider.setLogin("p1");
		provider.setPassword("p1");
		
		Provider provider2 = new Provider();
		provider2.setName("hammadi");
		provider2.setAddress("Zahrouni");
		provider2.setLogin("p2");
		provider2.setPassword("p2");

		Customer customer = new Customer();
		customer.setName("skon");
		customer.setCredit(100F);
		customer.setLogin("c1");
		customer.setPassword("c1");

		Customer customer2 = new Customer();
		customer2.setName("siryne");
		customer2.setCredit(10F);
		customer2.setLogin("c2");
		customer2.setPassword("c2");

		userServicesLocal.addUser(provider);
		userServicesLocal.addUser(customer);
		userServicesLocal.addUser(customer2);
		userServicesLocal.addUser(provider2);

	}

}
