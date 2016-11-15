package userServicesGui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.sigma.sigmarket.persistence.Customer;
import tn.esprit.sigma.sigmarket.persistence.User;
import tn.esprit.sigma.sigmarket.services.interfaces.UserServicesRemote;

public class TestLogin {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserServicesRemote userServicesRemote = (UserServicesRemote) context.lookup(
				"sigmarket-ejb/UserServices!tn.esprit.sigma.sigmarket.services.interfaces.UserServicesRemote");

		User user = userServicesRemote.login("c1", "c1");
		if (user != null) {
			if (user instanceof Customer) {
				System.out.println("i am a customer");
			} else {
				System.out.println("i am a provider");
			}
		}
	}

}
