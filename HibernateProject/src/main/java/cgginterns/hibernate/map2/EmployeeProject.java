package cgginterns.hibernate.map2;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeProject {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//creating emp objects
		ArrayList<Project> emp1 = new ArrayList<Project>();
		ArrayList<Project> emp2 = new ArrayList<Project>();
		ArrayList<Project> emp3 = new ArrayList<Project>();
		ArrayList<Employee> proj1 = new ArrayList<Employee>();
		ArrayList<Employee> proj2 = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Divya");
		Employee e2 = new Employee();
		e2.setEmpId(102);
		e2.setEmpName("nandini");
		Employee e3 = new Employee();
		e3.setEmpId(103);
		e3.setEmpName("Fariha");
		Project p1 = new Project();
		p1.setProjectId(20);
		p1.setProjectName("library");
		Project p2 = new Project();
		p2.setProjectId(21);
		p2.setProjectName("Admininstration");
		emp1.add(p1);
		emp2.add(p2);
		emp2.add(p1);
		emp3.add(p2);
		e1.setProjects(emp1);
		e2.setProjects(emp2);
		e3.setProjects(emp3);
		proj1.add(e1);
		proj1.add(e2);
		proj2.add(e2);
		proj2.add(e3);
		p1.setEmployees(proj1);
		p2.setEmployees(proj2);
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(p1);
		session.save(p2);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
