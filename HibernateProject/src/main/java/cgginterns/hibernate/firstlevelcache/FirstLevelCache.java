package cgginterns.hibernate.firstlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cgginterns.hibernate.Student;

public class FirstLevelCache {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Student st = session.get(Student.class, 101);
		System.out.println(st);
		System.out.println("Doing something........");
		
		Student s1 = session.get(Student.class, 101);
		
		System.out.println(s1);
		System.out.println(session.contains(s1));
		
		session.close();
		factory.close();
	}

}
