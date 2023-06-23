package mapdefaultmethods;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComputeMethosExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Java");
		map.put(2, "Java");
		System.out.println("Original map: " + map);
		
		map.compute(1, (key, oldVal) -> oldVal.concat("Script"));
		map.compute(2, (key, oldVal) -> oldVal.concat("FrameWork"));
		System.out.println("Recomputed map: " + map);
		String r1 = map.compute(3, (key, oldVal) -> null);
		System.out.println(r1);
		System.out.println("Original map: " + map);
		String r2 = map.compute(3, (key, oldVal) -> null);
		System.out.println(r2);
		String r3 = map.compute(2, (key, oldVal) -> "Spring Framework");
		System.out.println(r3);
		System.out.println("After null: " + map);

	}

}
