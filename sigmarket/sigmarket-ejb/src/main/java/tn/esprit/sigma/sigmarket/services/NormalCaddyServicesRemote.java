package tn.esprit.sigma.sigmarket.services;

import javax.ejb.Remote;

@Remote
public interface NormalCaddyServicesRemote {
	void addItem(String itemName);
}
