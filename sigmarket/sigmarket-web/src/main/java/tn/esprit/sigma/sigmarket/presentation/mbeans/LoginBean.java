package tn.esprit.sigma.sigmarket.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.sigma.sigmarket.persistence.Provider;
import tn.esprit.sigma.sigmarket.persistence.User;
import tn.esprit.sigma.sigmarket.services.interfaces.UserServicesLocal;

@ManagedBean
@SessionScoped
public class LoginBean {
	// Models
	private User user = new User();
	// injection of dependency
	@EJB
	private UserServicesLocal userServicesLocal;

	// Recall sevices
	public String doLogin() {
		User userLoggedIn = null;
		String navigateTo = "";
		userLoggedIn = userServicesLocal.login(user.getLogin(), user.getPassword());
		if (userLoggedIn != null) {
			user = userLoggedIn;
			if (userLoggedIn instanceof Provider) {
				navigateTo = "/pages/providerHome/providerHome?faces-redirect=true";
			} else {
				navigateTo = "/pages/customerHome/customerHome?faces-redirect=true";
			}

		} else {
			navigateTo = "horreur?faces-redirect=true";

		}
		return navigateTo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
