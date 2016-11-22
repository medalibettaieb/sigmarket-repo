package tn.esprit.sigma.sigmarket.presentation.mbeans;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.sigma.sigmarket.persistence.Product;

@ManagedBean
@SessionScoped
public class CaddyBean {
	private Map<Product, Integer> map;
	private int mapSize=0;

	@PostConstruct
	public void init(){
		map=new HashMap<>();
		
	}

	public Map<Product, Integer> getMap() {
		return map;
	}

	public void setMap(Map<Product, Integer> map) {
		this.map = map;
	}

	public int getMapSize() {
		mapSize = map.size();
		return mapSize;
	}

	public void setMapSize(int mapSize) {
		this.mapSize = mapSize;
	}

}
