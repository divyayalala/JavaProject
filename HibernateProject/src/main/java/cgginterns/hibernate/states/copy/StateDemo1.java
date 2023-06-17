package cgginterns.hibernate.states.copy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cgginterns.hibernate.Student;

public class StateDemo1 {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		s.beginTransaction();
		Student s1 = s.get(Student.class,104);
		s.evict(s1);
		s.update(s1);
		s.getTransaction().commit();
		s.close();
		factory.close();
	}

}
