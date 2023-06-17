package cgginterns.lambdas;

public class LambdaExample {
	public static void main(String[] args) {
		//implementing interface
		createLambda();
		anonymousClassZeroParam();
		System.out.println("----------------------------------");
		lambdaWithOneParameter();
		System.out.println("-------------------------------");
		lambdaWithMultipleParam();
		System.out.println("-------------------------------");
		lambdaWithParamAndReturnType();
	}

	private static void lambdaWithParamAndReturnType() {
		MyInterface4 i4 = (a1,a2)->a1>a2;
		System.out.println(i4.test(5,4));
	}

	private static void lambdaWithMultipleParam() {
		MyInterface3 i3 = (i,j)->{
			System.out.println("Your name: "+i);
			System.out.println("Your age: "+j);
		};
		i3.method3("divya",22);
		
	}

	private static void lambdaWithOneParameter() {
		 MyInterface2 i2 = msg->{
			 System.out.println("Welcome "+msg);
		 };
		 i2.method2("Divya");
	}

	private static void anonymousClassZeroParam() {
		MyInterface1 i1 = new MyInterface1(){

			@Override
			public void method1() {
				System.out.println("anonymous class");
				
			}
			
		};
		i1.method1();
		
	}

	private static void createLambda() {
		MyInterface1 i = ()->{System.out.println("Lambda with zero parameters");
		};
		//calling lambda
		i.method1();
	}

}
