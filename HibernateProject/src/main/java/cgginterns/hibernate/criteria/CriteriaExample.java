package cgginterns.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import cgginterns.hibernate.Student;
import cgginterns.hibernate.map1.Brand;

public class CriteriaExample {
     public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Brand.class);
		//c.add(Restrictions.eq("certi.course","java"));
		//c.add(Restrictions.gt("id", 150));
		//c.add(Restrictions.like("certi.course","R%"));
		List<Brand> list = c.list();
		for(Brand s:list) {
			System.out.println(s);
			
		}
		session.close();
		factory.close();
	}
}
