package one;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OneThirteen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Product Purchase Date(dd/mm/yyyy) :");
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String text = scan.next();
		LocalDate date = LocalDate.parse(text,pattern);
		System.out.println("Enter the duration of months(1-12):");
		int months = scan.nextInt();
		System.out.println("Enter the duration of years:");
		int year = scan.nextInt();
		LocalDate date2 = date.plusYears(year).plusMonths(months);
		System.out.println("Product warantee will expires on :"+date2);
		
	}

}
