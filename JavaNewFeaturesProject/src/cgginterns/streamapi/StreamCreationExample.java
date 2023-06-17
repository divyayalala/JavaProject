package cgginterns.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample {
	public static void main(String[] args) {
		String[] arr = { "ABC", "BCD", "CDE" };
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		Stream<String> stream2 = Stream.of("abc", "xyz", "def");
		System.out.println("----------------------------");
		stream2.forEach(System.out::println);

		List<String> list = new ArrayList<>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		Stream<String> stream3 = list.stream();
		System.out.println("------------------------");
		stream3.forEach(System.out::println);

		System.out.println("--------------------------");
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("PK", 23));
		stuList.add(new Student("RK", 25));
		stuList.add(new Student("SK", 27));
		stuList.add(new Student("OK", 29));
		stuList.add(new Student("LK", 20));
		stuList.add(new Student("MK", 27));
		stuList.add(new Student("NK", 28));
		Stream<Student> stream4 = stuList.parallelStream();
		System.out.println("Student data send for processing");
		stream4.forEach(s -> doProcess(s));
	}

	private static void doProcess(Student s) {
		System.out.println(s);

	}
//massive amount of data for processing : going for parellel stream is good option
//order of iteration of elements is not maintained
//makes use of multiple threads as well as multi core processes

}
