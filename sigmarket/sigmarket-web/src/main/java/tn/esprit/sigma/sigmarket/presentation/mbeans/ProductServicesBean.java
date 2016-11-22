package tn.esprit.sigma.sigmarket.presentation.mbeans;

import java.util.ArrayList;
import java.util.List;

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
	private List<Product> products = new ArrayList<Product>();
	private Boolean displayF1 = true;
	private Boolean displayF2 = false;

	@EJB
	private ProductServicesLocal productServicesLocal;
	@ManagedProperty(value = "#{loginBean}")
	private LoginBean loginBean;

	public String doSaveOrUpdateProduct() {
		Integer idProvider = loginBean.getUser().getId();
		productServicesLocal.addProductWithProvider(product, idProvider);
		return "";
	}

	public void selectProduct() {
		displayF1 = false;
		displayF2 = true;
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

	public List<Product> getProducts() {
		products = productServicesLocal.findAllProducts();
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Boolean getDisplayF1() {
		return displayF1;
	}

	public void setDisplayF1(Boolean displayF1) {
		this.displayF1 = displayF1;
	}

	public Boolean getDisplayF2() {
		return displayF2;
	}

	public void setDisplayF2(Boolean displayF2) {
		this.displayF2 = displayF2;
	}

}
