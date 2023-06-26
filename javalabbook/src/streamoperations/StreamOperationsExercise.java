package streamoperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationsExercise {
	public static void displayPlayers(List<Player> l1) {
		l1.forEach(System.out::println);
		
	}
	public static void displayPlayersForCountry(String country,List<Player> l1) {
		Stream<Player> filter = l1.stream().filter(a->a.getCountry().getCountryName()==country).filter(a->a.getHighestScore()>100);
		filter.forEach(System.out::println);
	}
	public static LinkedList<String> getPlayerNames(List<Player> l1){
		Stream<String> sorted = l1.stream().filter(a->a.getRuns()>5000).sorted(Comparator.comparing(Player::getPlayerName).reversed()).map(a->a.getPlayerName());
		LinkedList<String> collect = sorted.collect(Collectors.toCollection(LinkedList::new));
		//collect.forEach(System.out::println);;
		return collect;
	}
	public static double getAverageRunsByCountry(String country,List<Player> l1) {
	    Double collect = l1.stream().filter(a->a.getCountry().getCountryName()==country).collect(Collectors.averagingInt(a->a.getRuns()));      
		return collect;
		
	}
	public static List<String> getPlayerNamesSorted(List<Player> l1) {
		  List<String> sortedList = l1.stream().sorted(Comparator.comparing((Player a) -> a.getCountry().getCountryName())
				  .thenComparing(Player::getMatchesPlayed).reversed()).map(a->a.getPlayerName())
		            .collect(Collectors.toList());
         //sortedList.forEach(System.out::println);
         return sortedList;
		
	}
	public static Map<String,String> getPlayerCountry(List<Player> l1){
		Stream<Player> filter = l1.stream().filter(a->a.getMatchesPlayed()>100);
		Map<String, String> collect = filter.collect(Collectors.toMap(Player::getPlayerName, a->a.getCountry().getCountryName()));
		return collect;
		
	}
	public static void getMaxRunsPlayer(List<Player> l1) {
		Optional<Player> max = l1.stream().max(Comparator.comparingInt(a->a.getRuns()));
		System.out.println(max);
	}
	public static void findPlayer(String name, String country,List<Player> l1) {
		Stream<Player> filter = l1.stream().filter(a->a.getCountry().getCountryName()==country).filter(a->a.getPlayerName()==name);
		filter.forEach(System.out::println);
	}
	public static boolean checkHighScoreByCountry(String country,List<Player> l1) {
		boolean anyMatch = l1.stream().filter(a->a.getCountry().getCountryName()==country).anyMatch(a->a.getRuns()>10000);
		return anyMatch;
	}
	private static List<Player> playerList = new ArrayList<>();
	public static void main(String[] args) {
		playerList.add(new Player("Sachin",110,50000,76,new Country(101,"India")));
		playerList.add(new Player("Dhoni",80,60000,104,new Country(101,"India")));
		playerList.add(new Player("Warner",85,5672,105,new Country(102,"Australia")));
		playerList.add(new Player("Kane",73,6789,104,new Country(103,"NewZealand")));
		playerList.add(new Player("Rashid",115,1743,78,new Country(104,"Afganistan")));
		playerList.add(new Player("Yuvraj",95,2000,105,new Country(101,"India")));
		StreamOperationsExercise.displayPlayers(playerList);
		System.out.println("-----------------------------------");
		StreamOperationsExercise.displayPlayersForCountry("India", playerList);
		System.out.println("-----------------------------------");
		LinkedList<String> list1 = StreamOperationsExercise.getPlayerNames(playerList);
		list1.forEach(System.out::println);
		System.out.println("------------------------------------");
		System.out.println(StreamOperationsExercise.getAverageRunsByCountry("India", playerList));
		System.out.println("---------------------------------------");
		List<String> l2 = StreamOperationsExercise.getPlayerNamesSorted(playerList);
		System.out.println(l2);
		System.out.println("---------------------------------------");
		Map<String,String> m1 = StreamOperationsExercise.getPlayerCountry(playerList);
		System.out.println(m1);
		System.out.println("----------------------------------------");
		StreamOperationsExercise.getMaxRunsPlayer(playerList);
		System.out.println("---------------------------------------");
		StreamOperationsExercise.findPlayer("Sachin","India",playerList);
		System.out.println("------------------------------------");
		System.out.println(StreamOperationsExercise.checkHighScoreByCountry("India", playerList));
	}
}
