package tn.esprit.sigma.sigmarket.services;

import javax.ejb.Local;

@Local
public interface NormalCaddyServicesLocal {
	void addItem(String itemName);
}
