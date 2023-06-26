package cgginterns.privatemethods;

public interface Welcome {
	void hi();
		default void greet() {
			System.out.println("inside default greet method");
			welcome();
			welcome2();
		}
		public static void test() {
			System.out.println("test");
			welcome();               
		}
		private static void welcome() {
			System.out.println("Welcome to java 9");
		}
        private void welcome2() {
        	System.out.println("welcome again to Java 9");
        }
}
