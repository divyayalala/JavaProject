package cgginterns.hibernate.map1;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BrandProductMapDemo {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	
	//creating brand
//	Brand b = new Brand();
//	b.setBrandId(1);
//	b.setBrandName("Tata");
//	
//	//creating products
//	Product p1 = new Product();
//	p1.setProductId(11);
//	p1.setProductName("Tata car");
//	p1.setBrand(b);
//	
//	Product p2 = new Product();
//	p2.setProductId(12);
//	p2.setProductName("Tata salt");
//	p2.setBrand(b);
//	
//	Product p3 = new Product();
//	p3.setProductId(13);
//	p3.setProductName("Tata clothes");
//	p3.setBrand(b);
//	
//	ArrayList<Product> products = new ArrayList<Product>();
//	products.add(p1);
//	products.add(p2);
//	products.add(p3);
//	b.setProducts(products);
	
	Session session = factory.openSession();
//	session.beginTransaction();
//	session.save(b);
//	session.save(p1);
//	session.save(p2);
//	session.save(p3);
//	session.getTransaction().commit();
	
	//fetching
	Brand brand = session.get(Brand.class, 1);
	System.out.println(brand.getBrandName());
	System.out.println(brand.getProducts().size());
//	for(Product prd:brand.getProduct()) {
//		System.out.println(prd.getProductName());
//	}
	
	session.close();
	factory.close();

}
}
