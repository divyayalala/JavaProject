package cgginterns.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(new Product(23,"potatoes"),new Product(30,"orange"),
				new Product(13,"lemon"),new Product(23,"Bread"));
		//creating parallel stream from collections
		Stream<Product> stream = productList.parallelStream();
	    System.out.println(stream.isParallel());
	    boolean anyMatch = stream.map(product->product.getPrice()*12).anyMatch(price->price>200);
	    System.out.println(anyMatch);
	    //creating parallel stream from Intstream,longstream,doublestream
	    System.out.println("----------------------");
	    IntStream parallel = IntStream.range(1, 150).parallel();
	    System.out.println(parallel.isParallel());
	    //convert stream from parallel to sequential mode
	    System.out.println("----------------------");
	    IntStream sequential = parallel.sequential();
	    System.out.println(sequential.isParallel());
	    
	}

}
