package cgginterns.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingIntExample {
	public static void main(String[] args) {
		List<String> List = Arrays.asList("Carter","James","Davis","Zorra","Barry","Zola");
		System.out.println("Before sorting....");
		System.out.println(List);
		Comparator<String> comparingInt = Comparator.comparingInt(String::length);
		Collections.sort(List,comparingInt);
		System.out.println("After sorting");
		System.out.println(List);
		
	}

}
