package one;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class OneEleven {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Date");
	    System.out.println("Enter year:");
	    int year = scan.nextInt();
	    System.out.println("Enter Month(1-12):");
	    int month = scan.nextInt();
	    System.out.println("Enter day (1-31) :");
	    int day = scan.nextInt();
	    LocalDate of = LocalDate.of(year, month, day);
	    Period period = of.until(now);
	    System.out.println("Duration in years: "+period.get(ChronoUnit.YEARS));
	    System.out.println("Duration in Months: "+period.get(ChronoUnit.MONTHS));
	    System.out.println("Duration in Days: "+period.get(ChronoUnit.DAYS));
	    
	}

}
