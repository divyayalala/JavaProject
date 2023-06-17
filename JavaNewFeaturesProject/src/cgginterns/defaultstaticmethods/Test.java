package cgginterns.defaultstaticmethods;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		 MyInterface myClass = new MyClass();
		 ArrayList<Student> list = new ArrayList<Student>();
		 list.add(new Student("divya",10));
		 list.add(new Student("fariha",40));
		 list.add(new Student("nandu",5));
		 List<Student> students = myClass.sortStudents(list);
		 for(Student s1:students) {
			 System.out.println(s1.getName()+" "+s1.getAge());
		 }
		 MyInterface.greet("Divya");
		 ArrayList<Integer> list2 = new ArrayList<Integer>();
		 list2.add(2);
		 list2.add(1);
		 list2.add(10);
		 int maxnum = myClass.getMaxnum(list2);
		 System.out.println(maxnum);

	}

}
