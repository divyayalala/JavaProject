package streamoperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaExercise {
	public static void displayCountries(List<String> countries) {
		countries.forEach(a->System.out.println(a));
	}
	public static void displayCountryCapitals(Map<String,String> map) {
		map.forEach((a,b)->{
			System.out.println("Country:"+a+"\t"+"Capital:"+b);
		});
	}
	public static void sortCountriesByName(List<String> list) {
		list.sort((a,b)->a.compareTo(b));
		list.forEach(System.out::println);
		
	}
	public static void sortCountriesBylength(List<String> list) {
		Comparator<String> comparingInt = Comparator.comparingInt(String::length);
		list.sort(comparingInt.reversed());
		list.forEach(System.out::println);
		
	}
	public static void removeCountry(String name,List<String> list) {
		if(name.length()>6) {
			list.remove(name);
			System.out.println(name+" removed");
			
		}		
	}
	static List<String> countries = new ArrayList<>();
	static Map<String,String> countryCapitals = new HashMap<>();
	static {
		countries.add("India");
		countries.add("China");
		countries.add("Japan");
		countries.add("Egypt");
		countries.add("Germany");
		countryCapitals.put("India","New Delhi");
		countryCapitals.put("China","Beijing");
		countryCapitals.put("Japan","Tokyo");
		countryCapitals.put("Egypt","Cairo");
		countryCapitals.put("Germany","Berlin");
	}
	public static void main(String[] args) {
		LambdaExercise.displayCountries(countries);
		System.out.println("----------------------------");
		LambdaExercise.displayCountryCapitals(countryCapitals);
		System.out.println("----------------------------");
		LambdaExercise.sortCountriesByName(countries);
		System.out.println("----------------------------");
		LambdaExercise.sortCountriesBylength(countries);
		System.out.println("-----------------------------");
		LambdaExercise.removeCountry("Germany", countries);
		
		
	}

}
