package cgg.sma.client;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import cgg.sma.student.Student;

/**
 * Hello world!
 *
 */
public class StudentManage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op;
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		while (true) {
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to update student");
			System.out.println("Press 3 to delete student");
			System.out.println("Press 4 to display all students");
			System.out.println("Press 5 to exit");
			op = scan.nextInt();
			if (op == 1) {
				Student s1 = new Student();
				System.out.println("Enter id,name,phonenum,city");
				int id = scan.nextInt();
				s1.setStudentId(id);
				String name = scan.next();
				s1.setsName(name);
				String phone = scan.next();
				s1.setsPhone(phone);
				String city = scan.next();
				s1.setsCity(city);
				session.beginTransaction();
				session.save(s1);
				session.getTransaction().commit();
			} 
			else if(op==2) {
				System.out.println("Enter student id :");
				int id = scan.nextInt();
				Student st = session.get(Student.class, id);
				System.out.println("Enter new phonenum");
				String phone = scan.next();
				System.out.println("Enter new city");
				String city = scan.next();
				session.beginTransaction();
				st.setsPhone(phone);
				st.setsCity(city);
				session.getTransaction().commit();
			}
			else if(op ==3) {
				System.out.println("enter id to delete");
				int id = scan.nextInt();
				Student st = session.get(Student.class, id);
				session.beginTransaction();
				session.delete(st);
				session.getTransaction().commit();
				System.out.println("deleted succesfully");
			}
			else if(op == 4) {
				String query = "from Student";
				Query q = session.createQuery(query);
				List<Student> l1 = q.list();
				System.out.println();
				System.out.println("Id \t Name \t phoneno \t city");
				for(Student s1:l1) {
					System.out.println(s1.getStudentId()+"\t"+s1.getsName()+"\t"+s1.getsPhone()+"\t"+s1.getsCity());
					System.out.println("------------------------------------------");
				}
			}
			else if (op == 5)
				break;
		}
		session.close();
		factory.close();
		
	}
}
