package cgginterns.lambdas;

public class AddDemo {
	public static void main(String[] args) {
		MyInterface5 i5 = (a,b)->{
			return a+b;
		};
		System.out.println(i5.add(3, 4));
	}

}
