package tn.esprit.sigma.sigmarket.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import tn.esprit.sigma.sigmarket.persistence.Provider;
import tn.esprit.sigma.sigmarket.persistence.User;
import tn.esprit.sigma.sigmarket.services.interfaces.UserServicesLocal;

@ManagedBean
@SessionScoped
public class LoginBean {
	// Models
	private User user = new User();
	private Boolean hasRole = false;
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

	public String doLogOut() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login?faces-redirect=true";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Boolean getHasRole() {
		return hasRole;
	}

	public void setHasRole(Boolean hasRole) {
		this.hasRole = hasRole;
	}

}
