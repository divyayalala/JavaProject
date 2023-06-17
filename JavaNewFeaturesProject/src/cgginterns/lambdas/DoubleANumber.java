package cgginterns.lambdas;

public class DoubleANumber {
	public static void main(String[] args) {
		MyInterface7 i7 = a->{
			return 2*a;
		};
		System.out.println(i7.doublenumber(6));
	}

}
