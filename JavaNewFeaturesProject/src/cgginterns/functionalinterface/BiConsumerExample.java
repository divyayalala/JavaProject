package cgginterns.functionalinterface;

import java.util.HashMap;
import java.util.Map;

import cgginterns.streamapi.Student;

public class BiConsumerExample {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		//BiConsumer<Integer,String> biconsumer = (k,v)->System.out.println("key : "+k+"\t"+"Value : "+v);
		map.forEach((k,v)->System.out.println("key : "+k+"\t"+"Value : "+v));
		Map<Integer,Student> stuMap = new HashMap<>();
		stuMap.put(1001, new Student("divya",22));
		stuMap.put(1002, new Student("nandu",23));
		stuMap.put(1003, new Student("pooja",24));
		stuMap.put(1004, new Student("fariha",20));
		System.out.println("-----------------------");
		stuMap.forEach((k,v)->System.out.println("key : "+k+"\t"+"Value : "+v));
	}

}
