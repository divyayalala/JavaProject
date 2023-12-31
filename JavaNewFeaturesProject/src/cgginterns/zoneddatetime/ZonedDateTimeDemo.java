package cgginterns.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now);
		ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("America/New York"));
		ZonedDateTime of = ZonedDateTime.of(2023, 6, 7, 12, 30, 45, 2345,ZoneId.of("America/Chicago"));
		System.out.println(of);
		System.out.println(paris);
	}

}
