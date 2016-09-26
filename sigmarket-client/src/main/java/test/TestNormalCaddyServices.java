package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.sigma.sigmarket.services.NormalCaddyServicesRemote;

public class TestNormalCaddyServices {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();

			String jndiName = "sigmarket-ear/sigmarket-ejb/NormalCaddyServices!tn.esprit.sigma.sigmarket.services.NormalCaddyServicesRemote";

			NormalCaddyServicesRemote proxy = (NormalCaddyServicesRemote) context.lookup(jndiName);

			proxy.addItem("item1");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
