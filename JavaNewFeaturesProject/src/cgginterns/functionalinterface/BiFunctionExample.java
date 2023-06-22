package cgginterns.functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionExample {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,String> bifunction = (n1,n2)->"Result :"+(n1+n2);
	    System.out.println(bifunction.apply(12, 13));
	}
}
