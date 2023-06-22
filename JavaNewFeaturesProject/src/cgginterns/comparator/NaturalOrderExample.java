package cgginterns.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NaturalOrderExample {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("davis",30));
		empList.add(new Employee("Alice",23));
		empList.add(new Employee("Barry",34));
		empList.add(new Employee("Martin",35));
		empList.add(new Employee("Martin",40));
		empList.add(new Employee("James",45));
		empList.add(new Employee("Martin",25));
		
		List<String> collect = empList.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println("Before sorting");
		collect.forEach(System.out::println);
		collect.sort(Comparator.reverseOrder());
		System.out.println("------------------------");
		collect.forEach(System.out::println);
	}

}
