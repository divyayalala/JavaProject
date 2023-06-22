package cgginterns.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListComparatorExample {
     public static void main(String[] args) {
    		List<Employee> empList = new ArrayList<Employee>();
    		empList.add(new Employee("davis",30));
    		empList.add(new Employee("Alice",23));
    		empList.add(new Employee("Barry",34));
    		empList.add(new Employee("Martin",35));
    		empList.add(new Employee("James",45));
    		System.out.println("Before sorting....");
    		System.out.println(empList);
    		System.out.println("After sorting");
    	    empList.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
    		System.out.println(empList);
	}
}
