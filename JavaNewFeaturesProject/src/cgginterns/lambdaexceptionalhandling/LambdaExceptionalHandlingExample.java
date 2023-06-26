package cgginterns.lambdaexceptionalhandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExceptionalHandlingExample {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3,6,0,8,10,20);
//		integers.forEach(i->{
//			
//			try {
//				System.out.println(50/i);
//			} catch (ArithmeticException e) {
//				System.out.println("Arithmetic Exception occured :"+e.getMessage());
//			}	
//		});
		integers.forEach(lambdaWrapper(i->System.out.println(50/i),Exception.class));
	   
	}
    private static<T,E extends Exception> Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer, Class<E> c){
    	
		return i->{
			try {
				consumer.accept(i);
			}
			catch(ArithmeticException e){
				System.out.println("Arithmetic Exception occured :"+e.getMessage());
			}
		};
    	
    }
}
