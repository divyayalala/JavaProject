package cgginterns.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeDemo {
	public static void main(String[] args) {
	ArrayList<Employee> list = new ArrayList<Employee>();
	list.add(new Employee("divya","abc@cgg.gov.in",75000));
	list.add(new Employee("nandini","nandu@cgg.gov.in",36000));
	list.add(new Employee("fariha","nandu@cgg.gov.in",25000));
	list.add(new Employee("sindhu","nandu@cgg.gov.in",30000));
	list.add(new Employee("harika","nandu@cgg.gov.in",45000));
	System.out.println("List before sorting");
	for(Employee e:list) {
		System.out.println(e);
	}
	System.out.println("------------------------------");
	Collections.sort(list,(o1,o2)->o1.getName().compareTo(o2.getName()) );
	System.out.println("List after sorting");
	for(Employee e:list) {
		System.out.println(e);
	}
}
}
                                                 