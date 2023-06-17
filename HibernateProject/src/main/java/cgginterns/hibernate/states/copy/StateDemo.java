package cgginterns.hibernate.states.copy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cgginterns.hibernate.Certificate;
import cgginterns.hibernate.Student;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Student student = new Student();
        student.setId(105);
        student.setName("abc");
        student.setCity("secundrabad");
        student.setCerti(new Certificate("android","2months"));
        Session s = factory.openSession();
        s.beginTransaction();
        s.save(student);
        
        //studnet:persistant
        student.setName("xyz");
        //student:removed state
//        Student st = s.get(Student.class, 105);
//        s.delete(st);
//        System.out.println(st);
//        s.delete(st);
        
        s.getTransaction().commit();
        s.close();
        //student:detached
        student.setName("cgg");
        System.out.println(student.getName());
        
        Session s1 = factory.openSession();
        Transaction tx = s1.beginTransaction();
        s1.update(student);
        Student st = s1.get(Student.class,105);
        System.out.println(st);
        tx.commit();
        s.close();
        factory.close();
	}

}
