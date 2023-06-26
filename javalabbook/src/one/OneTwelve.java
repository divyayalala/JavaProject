package one;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class OneTwelve {
   public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println("Enter date-1 (dd/mm/yyyy) :");
	String text = scan.next();
	LocalDate parse = LocalDate.parse(text, ofPattern);
	System.out.println("Enter date-2 (dd/mm/yyyy) :");
	String text2 = scan.next();
	LocalDate parse2 = LocalDate.parse(text2,ofPattern);
	Period period = parse.until(parse2);
	System.out.println("Duration in Years: "+period.get(ChronoUnit.YEARS));
	System.out.println("Duration in Months: "+period.get(ChronoUnit.MONTHS));
	System.out.println("Duration in Days: "+period.get(ChronoUnit.DAYS));
	
}
}
