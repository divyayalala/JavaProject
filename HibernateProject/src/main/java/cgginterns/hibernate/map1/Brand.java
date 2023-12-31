package cgginterns.hibernate.map1;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

public class Brand {
	
	@Id
	@Column(name = "brand_id")
	private int brandId;
	@Column(name = "brand_name")
	private String brandName;
	
	@OneToMany(mappedBy = "brand",fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
	private List<Product> products;
	
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Brand(int brandId, String brandName) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
	}
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", products=" + products + "]";
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> product) {
		this.products = product;
	}
}
