package productGui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.sigma.sigmarket.persistence.Product;
import tn.esprit.sigma.sigmarket.services.interfaces.ProductServicesRemote;

public class AddProductSlaveSideGui {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		ProductServicesRemote productServicesRemote = (ProductServicesRemote) context.lookup(
				"sigmarket-ear/sigmarket-ejb/ProductServices!tn.esprit.sigma.sigmarket.services.interfaces.ProductServicesRemote");

		Product product = new Product("lait");

		productServicesRemote.addProductWithProviderSlaveSide(product, 1);
	}

}
