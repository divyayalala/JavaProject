package cgginters.lambdathisreference;

public class ThisReferenceExample {
	public void process() {
		doOperate(30,n->{
			System.out.println(30+n);
			System.out.println(this);
		});
	}
	public static void main(String[] args) {
		int b = 30;
//		ThisReferenceExample.doOperate(b, new Operation() {
//
//			@Override
//			public void Operate(int i) {
//				System.out.println(b+i);
//				System.out.println(this);
//				
//			}
//			
//		});
         new ThisReferenceExample().process();
	}
	private static void doOperate(int i,Operation o) {
		o.Operate(i);
		
	}

}
