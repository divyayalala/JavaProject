package cgginterns.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
   public static void main(String[] args) {
	LocalDate now = LocalDate.now();
	System.out.println(now);//today's date will be displayed
	
	LocalDate of = LocalDate.of(2014,Month.JUNE,2);//converts to date
	System.out.println(of);
	System.out.println("Tomorrow date:"+now.plusDays(1));
	System.out.println("last month:"+now.minusMonths(1));
	System.out.println(now.isLeapYear());
	System.out.println("move to 30th day of month :"+now.withDayOfYear(1));
}
}
