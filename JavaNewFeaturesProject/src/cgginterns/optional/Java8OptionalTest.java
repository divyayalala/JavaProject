package cgginterns.optional;

import java.util.Optional;

public class Java8OptionalTest {
	public static void main(String[] args) {
		Integer value1 = null;
		Integer value2 = 18;
		Optional<Integer> a = Optional.ofNullable(value1);
		Optional<Integer> b = Optional.of(value2);
		Integer sum = sum(a,b);
		System.out.println(sum);
		
	}

	private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("first parameter is present : "+a.isPresent());
		System.out.println("Second parameter is present : "+b.isPresent());
		Integer orElse = a.orElse(0);
		Integer orElse1 = b.get();
		return orElse+orElse1;
		
	}

}
