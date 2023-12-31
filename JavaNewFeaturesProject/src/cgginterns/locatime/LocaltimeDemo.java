package cgginterns.locatime;

import java.time.LocalTime;

public class LocaltimeDemo {
     public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalTime of = LocalTime.of(15, 12,30,4567);
		System.out.println(time.plusHours(5));
		System.out.println(time.isAfter(of));
		System.out.println(time.withMinute(40));
		System.out.println(of);
	}
}
