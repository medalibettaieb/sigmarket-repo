package tn.esprit.sigma.sigmarket.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import tn.esprit.sigma.sigmarket.persistence.Product;
import tn.esprit.sigma.sigmarket.services.interfaces.ProductServicesLocal;

@ManagedBean
@ViewScoped
public class ProductServicesBean {
	private Product product = new Product();
	@EJB
	private ProductServicesLocal productServicesLocal;
	@ManagedProperty(value = "#{loginBean}")
	private LoginBean loginBean;

	public String doSaveOrUpdateProduct() {
		Integer idProvider = loginBean.getUser().getId();
		productServicesLocal.addProductWithProvider(product, idProvider);
		return "";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

}
