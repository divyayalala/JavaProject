package cgg.streampipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipeline {

	public static void main(String[] args) {
		Stream<String> onceModifiedStream = Stream.of("abcd","bbcd","cbcd").skip(1);
		onceModifiedStream.forEach(System.out::println); 
		System.out.println("----------------------------");
		Stream<String> stream = Stream.of("abc1","bbc2","cbc3");
		Stream<String> map = stream.skip(1).map(e->e.substring(0, 3));
		map.forEach(System.out::println);
		System.out.println("----------------------------");
		List<String> asList = Arrays.asList("abc1","abc2","abc3");
		long count = asList.stream().skip(1).map(e->e.substring(0,3)).sorted().count();
		System.out.println(count);

	}

}
