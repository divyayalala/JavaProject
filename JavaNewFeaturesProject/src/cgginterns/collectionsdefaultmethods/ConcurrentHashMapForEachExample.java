package cgginterns.collectionsdefaultmethods;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapForEachExample {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();	
		for(int i=0;i<=100;i++) {
			hashMap.put(i, "person_"+i);
		}
		hashMap.forEach((key,value)->{
			System.out.println("Thread: "+Thread.currentThread().getName());
			System.out.println(key+"\t"+value);
		});
		System.out.println("----------------------------");
		hashMap.forEach(3,(a,b)->{
			System.out.println("Thread:"+Thread.currentThread().getName());
			System.out.println(a+"\t"+b);
		});
	}

}
