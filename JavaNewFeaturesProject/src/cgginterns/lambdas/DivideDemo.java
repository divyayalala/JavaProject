package cgginterns.lambdas;

public class DivideDemo {
	public static void main(String[] args) {
	MyInterface8 i8 = (a,b)->{
		if(b==0)
			return 0;
		return a/b;
	};
    System.out.println(i8.divide(8, 4));
	}
}
