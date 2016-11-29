package tn.esprit.sigma.sigmarket.presentation.mbeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import tn.esprit.sigma.sigmarket.persistence.Category;
import tn.esprit.sigma.sigmarket.persistence.Product;
import tn.esprit.sigma.sigmarket.services.interfaces.ProductServicesLocal;
import tn.esprit.sigma.sigmarket.services.interfaces.PurchaseManagementLocal;

@ManagedBean
@ViewScoped
public class ProductServicesBean {
	private Product product = new Product();
	private List<Product> products = new ArrayList<Product>();
	private List<Product> productsByProvider = new ArrayList<>();
	private Boolean displayF1 = true;
	private Boolean displayF2 = false;
	private Integer quantity;
	private int categoryId;
	private List<Category> categories;

	@EJB
	private ProductServicesLocal productServicesLocal;
	@EJB
	private PurchaseManagementLocal purchaseManagementLocal;
	@ManagedProperty(value = "#{loginBean}")
	private LoginBean loginBean;
	@ManagedProperty(value = "#{caddyBean}")
	private CaddyBean caddyBean;

	public void doDelete() {
		productServicesLocal.deleteProduct(product.getId());
	}

	public void cancel() {

	}

	public String doSaveOrUpdateProduct() {
		Integer idProvider = loginBean.getUser().getId();
		Category category = productServicesLocal.findCategoryById(categoryId);
		product.setCategory(category);
		productServicesLocal.addProductWithProvider(product, idProvider);
		return "";
	}

	public String addToCaddy() {
		Map<Product, Integer> map = caddyBean.getMap();
		map.put(product, quantity);
		caddyBean.setMap(map);
		return null;
	}

	public String doPurchase() {
		Map<Product, Integer> map = caddyBean.getMap();
		for (Product p : map.keySet()) {
			purchaseManagementLocal.purchase(loginBean.getUser().getId(), p.getId(), map.get(p));
		}

		return null;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public CaddyBean getCaddyBean() {
		return caddyBean;
	}

	public void setCaddyBean(CaddyBean caddyBean) {
		this.caddyBean = caddyBean;
	}

	public List<Product> getProductsByProvider() {
		productsByProvider = productServicesLocal.findAllProductsByProvider(loginBean.getUser().getId());
		return productsByProvider;
	}

	public void setProductsByProvider(List<Product> productsByProvider) {
		this.productsByProvider = productsByProvider;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public List<Category> getCategories() {
		categories = productServicesLocal.findAllCategories();
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

}
