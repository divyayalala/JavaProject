package cgginterns.xmlmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class XMLMappingExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Person p1 = new Person(111,"abc","hyd","1234");
		session.beginTransaction();
		session.save(p1);
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}
