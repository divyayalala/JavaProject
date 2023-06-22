package cgginterns.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NullComparatorExample {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("davis",30));
		empList.add(new Employee("Alice",23));
		empList.add(new Employee("Barry",34));
		empList.add(new Employee(null,23));
		empList.add(new Employee("Barry",34));
		empList.add(new Employee(null,35));
		empList.add(new Employee("Martin",40));
		empList.add(new Employee("James",45));
		empList.add(new Employee("Martin",25));
		Comparator<Employee> comparing = Comparator.comparing(Employee::getName,Comparator.nullsFirst(String::compareTo));
		Collections.sort(empList,comparing);
		System.out.println(empList);
	}

}
