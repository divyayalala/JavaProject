package cgginterns.hibernate.onetomanyxml;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpDeptDemo {
    public static void main(String[] args) {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
	    Department d1 = new Department();
	    d1.setDeptId(1);
	    d1.setDeptName("cse");
	    Employee e1 = new Employee(1,"divya",5678);
	    e1.setDept(d1);
	    Employee e2 = new Employee(2,"divya",5678);
	    e2.setDept(d1);
	    Employee e3 = new Employee(3,"divya",5678);
	    e3.setDept(d1);
	    ArrayList<Employee> l1 = new ArrayList<Employee>();
	    l1.add(e1);
	    l1.add(e2);
	    l1.add(e3);
	    d1.setEmployees(l1);
	    session.beginTransaction();
	    session.save(d1);
	    session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
