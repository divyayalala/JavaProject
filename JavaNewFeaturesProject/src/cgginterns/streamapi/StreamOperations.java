package cgginterns.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("FFA");
		list.add("AAFA");
		list.add("DDFD");
		list.add("BBFB");
		list.add("BBFB");
//		Stream<String> stream = list.stream();//Intermediate operation
//		Stream<String> distinct = stream.distinct();//Intermediate operation
//		long count = distinct.count();
		long count = list.stream().distinct().count();
		System.out.println(count);
		//streams cannot be reused
		boolean match = list.stream().allMatch(ele->ele.contains("FA"));
		System.out.println(match);
		System.out.println("-----------------------");
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("PK", 57));
		stuList.add(new Student("RK", 25));
		stuList.add(new Student("SK", 47));
		stuList.add(new Student("OK", 29));
		stuList.add(new Student("LK", 20));
		stuList.add(new Student("MK", 27));
		stuList.add(new Student("NK", 28));
		Stream<Student> filteredList = stuList.stream().filter(s->s.getAge()>25);
		filteredList.forEach(System.out::println);
		boolean anyMatch = stuList.stream().anyMatch(s->s.getAge()>35);
		System.out.println(anyMatch);
		System.out.println("---------------------------------");
		boolean noneMatch = stuList.stream().noneMatch(s->s.getAge()>55);
		System.out.println(noneMatch);

		
		
	}

}
