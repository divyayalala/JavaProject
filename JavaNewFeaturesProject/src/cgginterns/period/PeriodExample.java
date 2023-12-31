package cgginterns.period;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
	public static void main(String[] args) {
		LocalDate of = LocalDate.of(2014, 6, 2);
		LocalDate now = LocalDate.now();
		Period period = of.until(now);
		System.out.println(period.get(ChronoUnit.DAYS));
		System.out.println(period.get(ChronoUnit.MONTHS));
		System.out.println(period.get(ChronoUnit.YEARS));
		System.out.println("-------------------------------");
		LocalDate initialDate = LocalDate.now();
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		int days = Period.between(initialDate, finalDate).getDays();
		System.out.println(days);

		System.out.println("-----------------------------------");
		long between = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println(between);

		System.out.println("-----------------------------------");
		// to calculate age
		LocalDate today = LocalDate.now();
		LocalDate of2 = LocalDate.of(2001, Month.MARCH, 19);
		Period between2 = Period.between(of2, today);
		long days2 = ChronoUnit.DAYS.between(of2, today);
		System.out.println(between2);
		System.out.println(days2);

		System.out.println("-----------------------------------");

		// to calculate next birthday
		LocalDate nextBDay = of2.withYear(today.getYear());
		System.out.println(nextBDay);
		if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
			nextBDay = nextBDay.plusYears(1);
		}
		Period p = Period.between(today, nextBDay);
		long p1 = ChronoUnit.DAYS.between(today, nextBDay);
		System.out.println("There are " + p.getMonths() + " months, and " + p.getDays()
				+ " days until your next Birthday (" + p1 + " total");
		System.out.println("---------------------------------");
		LocalTime initialTime = LocalTime.of(6, 30, 0);
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		long seconds = Duration.between(initialTime, finalTime).getSeconds();
		System.out.println(seconds);
		long seconds2 = ChronoUnit.SECONDS.between(initialTime, finalTime);
		System.out.println(seconds2);

		System.out.println("------------------------------------");

		// Date and time formatting
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.format(formatter));

		System.out.println("-------------------------------------");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime.format(formatter2));
		System.out.println("-------------------------------------");
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String text = "12/02/2001";
		LocalDate parse = LocalDate.parse(text, ofPattern);
		System.out.println(parse);
		System.out.println("-------------------------------------");
		DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("HH-mm-ss");
		String time = "12-40-20";
		LocalTime parse2 = LocalTime.parse(time, ofPattern2);
		System.out.println(parse2);
	}
}
