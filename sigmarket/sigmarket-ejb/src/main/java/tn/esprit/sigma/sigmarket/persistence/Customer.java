package tn.esprit.sigma.sigmarket.persistence;

import java.io.Serializable;
import java.lang.Float;
import javax.persistence.*;

import tn.esprit.sigma.sigmarket.persistence.User;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity

public class Customer extends User implements Serializable {

	
	private Float credit;
	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
	}   
	public Float getCredit() {
		return this.credit;
	}

	public void setCredit(Float credit) {
		this.credit = credit;
	}
   
}
