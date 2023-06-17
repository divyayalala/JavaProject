package cgginterns.lambdas;

public class FooDemo {
	public static void main(String[] args) {
		foo f=()->System.out.println("Hello All...."); 
		doPerform(f);
	}

	private static void doPerform(foo f) {
		f.greet();
	}
	
}
