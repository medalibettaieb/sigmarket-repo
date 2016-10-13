package tn.esprit.sigma.sigmarket.services;

import javax.ejb.Local;

import tn.esprit.sigma.sigmarket.persistence.User;

@Local
public interface UserServicesLocal {
	void addUser(User user);

	User findUserById(Integer idUser);
}
