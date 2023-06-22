package cgginterns.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorSortExample {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("davis",30));
		empList.add(new Employee("Alice",23));
		empList.add(new Employee("Barry",34));
		empList.add(new Employee("Martin",35));
		empList.add(new Employee("Martin",40));
		empList.add(new Employee("James",45));
		empList.add(new Employee("Martin",25));
		System.out.println("Before sorting");
		empList.forEach(System.out::println);
		//empList.sort(Comparator.comparing(Employee::getName));
		Comparator<Employee> comparing = Comparator.comparing(Employee::getName);
		empList.sort(comparing.reversed());
		System.out.println("After sorting");
		empList.forEach(System.out::println);
	}

}                                                                    


