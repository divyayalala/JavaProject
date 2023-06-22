package cgginterns.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparingExample {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("davis",30));
		empList.add(new Employee("Alice",23));
		empList.add(new Employee("Barry",34));
		empList.add(new Employee("Martin",35));
		empList.add(new Employee("James",45));
		System.out.println("Before Sorting.....");
		empList.forEach(System.out::println);
		System.out.println("-----------------");
		Comparator<Employee> comparing = Comparator.comparing(Employee::getName);
		//Comparator<Employee> comparing = Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER);
		Collections.sort(empList,comparing);
		System.out.println("After sorting...");
		empList.forEach(System.out::println);
		
	}

}
