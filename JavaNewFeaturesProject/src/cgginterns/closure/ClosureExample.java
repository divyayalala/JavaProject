package cgginterns.closure;

public class ClosureExample {
	public static void main(String[] args) {
		int x=30;
		int y = 40;
//		doOperate(x,new Operation() {
//
//			@Override
//			public void operate(int i) {
//				x=300;
//				System.out.println(i+y);
//			}
//			
//		});
		doOperate(x,i->{
			i=60
					;
			System.out.println(i+y);
		});
	    
	}
	private static void doOperate(int i,Operation o) {
		o.operate(i);
	}
}
