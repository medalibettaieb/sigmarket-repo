package tn.esprit.sigma.sigmarket.services;

import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class NormalCaddyServices implements NormalCaddyServicesLocal, NormalCaddyServicesRemote {

	private List<String> items;

	@Override
	public void addItem(String itemName) {

		items.add(itemName);
		System.out.println(items.size());
	}

}
