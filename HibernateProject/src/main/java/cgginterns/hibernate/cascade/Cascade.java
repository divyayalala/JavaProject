package cgginterns.hibernate.cascade;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import cgginterns.hibernate.map1.Brand;
import cgginterns.hibernate.map1.Product;

public class Cascade {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//		session.save(b1);
		Query q1 = session.createQuery("delete from Brand where brandId=:x");
		q1.setParameter("x", 5);
		int r = q1.executeUpdate();
		System.out.println(r);
		tx.commit();
		
		session.close();
		factory.close();

	}

}
