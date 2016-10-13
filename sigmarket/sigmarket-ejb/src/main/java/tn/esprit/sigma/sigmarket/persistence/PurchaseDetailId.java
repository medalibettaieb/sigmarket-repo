package tn.esprit.sigma.sigmarket.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class PurchaseDetailId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idUser;
	private Integer idProduct;
	private Date dateOfThePurchase;

	public PurchaseDetailId() {
	}

	public PurchaseDetailId(Integer idUser, Integer idProduct) {
		super();
		this.idUser = idUser;
		this.idProduct = idProduct;
		this.dateOfThePurchase = new Date();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idProduct == null) ? 0 : idProduct.hashCode());
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PurchaseDetailId other = (PurchaseDetailId) obj;
		if (idProduct == null) {
			if (other.idProduct != null)
				return false;
		} else if (!idProduct.equals(other.idProduct))
			return false;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		return true;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public Integer getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	public Date getDateOfThePurchase() {
		return dateOfThePurchase;
	}

	public void setDateOfThePurchase(Date dateOfThePurchase) {
		this.dateOfThePurchase = dateOfThePurchase;
	}

}
