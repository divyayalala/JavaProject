package one;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Person{
	private String firstName;
	private String lastName;
	private char gender;
	public Person(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) throws Exception {
			if(firstName == "")
			     throw new Exception ("first name is empty");
			else 
				this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) throws Exception{
		if(lastName == "") {
			throw new Exception("Last name is empty");
		}
		else {
		this.lastName = lastName;
		}
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge(LocalDate date) {
		LocalDate now = LocalDate.now();
		Period period = date.until(now);
		int age = period.getYears();
		return age;
	}
	public String getFullName(String firstName,String lastName) {
	     return firstName+lastName;
	}
}

public class OneSix {

	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(System.in);
		Person p1 = new Person();
		System.out.println("Enter FirstName :");
		String firstName=scan.next();
		p1.setFirstName(firstName);
		System.out.println("Enter LastName :");
		String lastName = scan.next();
		p1.setLastName(lastName);
		System.out.println("Enter Gender :");
		char gender=scan.next().charAt(0);
		p1.setGender(gender);
		System.out.println("Enter date of Birth(dd/mm/yyyy) :");
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String text = scan.next();
		LocalDate date = LocalDate.parse(text, pattern);
	    int age = p1.getAge(date);	
	    System.out.println("Age : "+age);
	    String fullName = p1.getFullName(firstName, lastName);
	    System.out.println("FullName :"+fullName);
		}
		catch(Exception e) {
			System.err.println("error: "+e.getMessage());;
		}
	}

}
