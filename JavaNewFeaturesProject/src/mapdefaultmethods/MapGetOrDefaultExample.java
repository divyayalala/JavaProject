package mapdefaultmethods;

import java.util.HashMap;
import java.util.Map;

public class MapGetOrDefaultExample {
	public static void main(String[] args) {
		Map<Integer,String> empMap = new HashMap<>();
		empMap.put(190292, "Martin");
		empMap.put(190928, "Farnk");
		empMap.put(902292, "Andrew");
		
		String result = empMap.getOrDefault(190292, "Rocky");
		System.out.println(result);
		
		System.out.println("----------------");
		
		empMap.forEach((k,v)->System.out.println(k+"\t"+v));
	}

}
