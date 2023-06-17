
package cgginterns.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
		Student student = new Student();
		student.setId(101);
		student.setName("divya2");
		student.setCity("sec");
		//create certificate object
		Certificate certi = new Certificate();
		certi.setCourse("java");
		certi.setDuration("3 months");
		student.setCerti(certi);
		System.out.println(student);
		
		
		Student student1 = new Student();
		student1.setId(102);
		student1.setName("nandini1");
		student1.setCity("sec");
		//create certificate object
		Certificate certi1 = new Certificate();
		certi1.setCourse("android");
		certi1.setDuration("3 months");
		student1.setCerti(certi1);
		System.out.println(student1);
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(student);
		session.save(student1);
		
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}
