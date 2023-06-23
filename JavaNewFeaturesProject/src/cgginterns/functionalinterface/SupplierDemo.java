package cgginterns.functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
			Supplier<Integer> supplier= SupplierDemo::getNum;
			for (int i = 1; i <= 20; i++) {
				System.out.println(supplier.get());
			}

		}
		
		private static Integer getNum() {
			Random random = new Random();
			
			return random.nextInt(100);
		}
}
