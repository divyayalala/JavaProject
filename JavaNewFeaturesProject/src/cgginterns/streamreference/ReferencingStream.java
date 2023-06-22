package cgginterns.streamreference;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReferencingStream {
	public static void main(String[] args) {
//		Stream<String> stream = Stream.of("a","b","c").filter(e->e.contains("b"));
//		Optional<String> findAny = stream.findAny();
//		System.out.println(findAny.get());
//		Optional<String> findFirst = stream.findFirst();
//		System.out.println(findFirst.get());
		List<String> list = Stream.of("a","b","c").filter(e->e.contains("b")).collect(Collectors.toList());
		Optional<String> findAny = list.stream().findAny();
		System.out.println(findAny.get());
		Optional<String> first = list.stream().findFirst();
		System.out.println(first.get());
	}

}
