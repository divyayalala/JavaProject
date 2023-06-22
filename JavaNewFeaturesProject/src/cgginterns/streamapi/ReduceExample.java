package cgginterns.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceExample {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,1,1);
		Integer reduce = integers.stream().reduce(23, (a,b)->a+b);
		System.out.println(reduce);
		System.out.println("-----------------------");
		List<String> names = new ArrayList<String>();
		names.add("divya");
		names.add("nandhini");
		names.add("pooja");
		names.add("fariha");
		List<String> collect = names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
	}

}
