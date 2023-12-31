package cgginterns.hibernate.secondlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cgginterns.hibernate.map1.Brand;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		Brand brand = session.get(Brand.class, 5);
		System.out.println(brand);
		session.close();
		
		Session session1 = factory.openSession();
		Brand brand1 = session1.get(Brand.class, 5);
		System.out.println(brand1);
		session1.close();
		factory.close();
	}

}
