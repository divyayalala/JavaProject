package cgginterns.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SampleExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Ravi","sindhu",30),new Person("nandu","jillala",20),new Person("fariha","fathima",30));
	    
		//sort list by lastname
		Collections.sort(people, (o1,o2)->o1.getLastName().compareTo(o2.getLastName()));
		//create a method that prints all the elements in the list
		System.out.println("printing all persons");
		printall(people);
		//create a method that prints all persons with last name beginning with 's'
		System.out.println("-----------------------------");
		System.out.println("Printing all persons beginning with 's'");
		//printConditinally(people,s->s.getLastName().startsWith("s"));
		System.out.println("--------------------------------------");
		System.out.println("Printing all persons beginning with 'R'");
		//printConditinally(people, p->p.getFirstName().startsWith("R"));
		System.out.println("----------------------------------------");
		printConditinally(people, p->true,System.out::println);
	}
	private static void printall(List<Person> persons) {
		for(Person p1:persons) {
			System.out.println(p1);
		}
	}
	private static void printConditinally(List<Person> persons,Predicate<Person> predicate,Consumer<Person> consumer) {
		for (Person person2 : persons) {
			if(predicate.test(person2)) {
				consumer.accept(person2);
			}
		}
		
	}

}
