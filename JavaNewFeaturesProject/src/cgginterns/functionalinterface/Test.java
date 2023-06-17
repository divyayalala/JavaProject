package cgginterns.functionalinterface;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		//anonymous class
		//createThreadUsingAnonymousClass();
		//createThreadUsingLambda();
		
		createCustomLambda();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("divya");
		list.add("fariha");
		list.add("nandini");
		list.add("sindhu");
		list.forEach(System.out::println);
		
	}

	private static void createCustomLambda() {
		
		//defining lambda
		MyInterface i1 = msg->{
			System.out.println("testing lambda "+msg);
			return 0;
		};
		//invoking lambda
		System.out.println(i1.meth1("hello"));
		
	}

	private static void createThreadUsingLambda() {
		Runnable r1 = ()->{
			System.out.println("My Runnable");
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		
	}

	private static void createThreadUsingAnonymousClass() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("I am thread my task is executing");
				
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}


