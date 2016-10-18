package tn.esprit.sigma.sigmarket.persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import tn.esprit.sigma.sigmarket.persistence.User;

/**
 * Entity implementation class for Entity: Provider
 *
 */
@Entity

public class Provider extends User implements Serializable {

	
	private String address;
	private static final long serialVersionUID = 1L;

	public Provider() {
		super();
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
   
}
