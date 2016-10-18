package purchaseGui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.sigma.sigmarket.services.interfaces.PurchaseManagementRemote;

public class TestPurchaseProcess {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		PurchaseManagementRemote purchaseManagementRemote = (PurchaseManagementRemote) context.lookup(
				"sigmarket-ear/sigmarket-ejb/PurchaseManagement!tn.esprit.sigma.sigmarket.services.interfaces.PurchaseManagementRemote");

		purchaseManagementRemote.purchase(3, 1, 10);
	}

}
