package tn.esprit.sigma.sigmarket.services.interfaces;

import javax.ejb.Remote;

import tn.esprit.sigma.sigmarket.persistence.User;

@Remote
public interface UserServicesRemote {
	void addUser(User user);

	User findUserById(Integer idUser);

	User login(String login, String password);
}
