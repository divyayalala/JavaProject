package cgginterns.hibernate.hql;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import cgginterns.hibernate.Student;

public class HqlDemo {
	public static void main(String[] args) {
		SessionFactory factory =new  Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
//		String query = "from Student s where s.city = :x and s.name = :n";
//		Query q = session.createQuery(query);
//		
//		q.setParameter("x","sec");
//		q.setParameter("n", "nandini");
//		List<Student> l1 = q.list();
//		for(Student student:l1) {
//			System.out.println(student.getName()+":"+student.getCity()+":"+student.getCerti().getCourse());
//		}
//		System.out.println("------------------------------------------");
//		session.beginTransaction();
//		Query q1 = session.createQuery("delete from Student s where s.city = :x");
//		q1.setParameter("x","hyd");
//		int r = q1.executeUpdate();
//		System.out.println("deleted");
//		System.out.println(r);
//		session.getTransaction().commit();
//		System.out.println("--------------------------------------------");
//		session.beginTransaction();
//		Query q2 = session.createQuery("update Student set city =:c where name = :n");
//		q2.setParameter("c", "siddipet");
//		q2.setParameter("n", "divya2");
//		int r1 = q2.executeUpdate();
//		System.out.println(r +"objects deleted");
//		
//		session.getTransaction().commit();
		
		System.out.println("-----------------------------------------------");
		Query q = session.createQuery("select b.brandId,b.brandName,p.productName from Brand b inner join b.products p");
		List<Object []> list = q.getResultList();
		for(Object[] arr:list) {
			System.out.println(Arrays.toString(arr));
		}
		session.close();
		factory.close();
	}

}
