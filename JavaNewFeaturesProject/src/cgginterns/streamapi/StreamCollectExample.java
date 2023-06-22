package cgginterns.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectExample {
	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(new Product(23,"potatoes"),new Product(30,"orange"),
				new Product(13,"lemon"),new Product(23,"Bread"));
		//method1(productList);
		IntSummaryStatistics collect = productList.stream().collect(Collectors.summarizingInt(Product::getPrice));
		System.out.println(collect);
		System.out.println("------------------------");
		Map<Integer, List<Product>> collect2 = productList.stream().collect(Collectors.groupingBy(Product::getPrice));
		collect2.forEach((a,b)->{
			System.out.println(a);
			System.out.println(b);
		});
		//dividing streams elements into groups according to sum predicate
		System.out.println("------------------------");
		Map<Boolean, List<Product>> collect3 = productList.stream().collect(Collectors.partitioningBy(p->p.getPrice()>15));
		collect3.forEach((a,b)->{
			System.out.println(a);
			System.out.println(b);
		});
		//pushing the collector to perform additinal transformation
		System.out.println("-------------------------");
		Set<Product> collect4 = productList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
		System.out.println(collect4);
	}

	private static void method1(List<Product> productList) {
		//convert stream to collection
		List<String> collect = productList.stream().map(Product::getName).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println("--------------------------");
		//reduce to string
		String collect2 = productList.stream().map(Product::getName).collect(Collectors.joining(",","[", "]"));
        System.out.println(collect2);	
        System.out.println("---------------------------");
        //Average price
        Double collect3 = productList.stream().collect(Collectors.averagingInt(Product::getPrice));
        System.out.println(collect3);
	}

}
