package tn.esprit.sigma.sigmarket.services.interfaces;

import javax.ejb.Local;

@Local
public interface PurchaseManagementLocal {
	void purchase(Integer idCustomer, Integer idProduct, Integer quantity);
}
