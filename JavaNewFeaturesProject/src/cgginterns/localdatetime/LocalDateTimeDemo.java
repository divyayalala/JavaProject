package cgginterns.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println(now.plusDays(30));
		LocalDateTime of = LocalDateTime.of(2023,04,05,12,45,39);
		System.out.println(now.withHour(18));
		System.out.println(of);
	}

}
