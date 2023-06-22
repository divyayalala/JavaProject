package cgginterns.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class InfiniteStreamExample {
	public static void main(String[] args) {
		Stream<Integer> iterate = Stream.iterate(0, i->i+2);
		List<Integer> collect = iterate.limit(10).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println("------------------");
		Stream<String> empty = Stream.<String>empty();
		System.out.println("--------------------");
		List<String> asList = Arrays.asList("a","b","c");
		Stream<String> stream = asList.stream();
		stream.forEach(System.out::println);
		System.out.println("--------------------------");
         String arr[] = {"a","b","c","d"};
         Stream<String> stream2 = Arrays.stream(arr);
         stream2.forEach(System.out::println);
         System.out.println("----------------------------");
         Stream<String> stream3 = Arrays.stream(arr, 0, 3);
         stream3.forEach(System.out::println);
         System.out.println("----------------------------");
         Stream<String> build = Stream.<String>builder().add("aa").add("bb").add("cc").build();
         build.forEach(System.out::println);
         System.out.println("----------------------------");
         Stream<String> limit = Stream.generate(()->"hello").limit(10);
         limit.forEach(System.out::println);
         System.out.println("----------------------------");
         IntStream range = IntStream.rangeClosed(1, 6);
         range.forEach(System.out::println);
         System.out.println("-----------------");
         LongStream range2 = LongStream.range(3, 7);
         range2.forEach(System.out::println);
         System.out.println("------------------");
         Random random = new Random();
         DoubleStream doubles = random.doubles(5);
         doubles.forEach(System.out::println);
         System.out.println("-----------------------------");
         IntStream chars = "divya".chars();
         chars.forEach(System.out::println);
	}

}
