package tn.esprit.sigma.sigmarket.services;

import javax.ejb.Remote;

import tn.esprit.sigma.sigmarket.persistence.User;

@Remote
public interface UserServicesRemote {
	void addUser(User user);
}
