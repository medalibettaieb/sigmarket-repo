package userServicesGui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.sigma.sigmarket.persistence.User;
import tn.esprit.sigma.sigmarket.services.interfaces.UserServicesRemote;

public class AddUserGui {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserServicesRemote userServicesRemote = (UserServicesRemote) context.lookup(
				"sigmarket-ear/sigmarket-ejb/UserServices!tn.esprit.sigma.sigmarket.services.UserServicesRemote");

		User user=new User();
		user.setId(1);
		user.setName("user");
		
		userServicesRemote.addUser(user);
	}

}
