package cgginterns.privatemethods;

public class WelcomeDemo implements Welcome {

	
	public static void main(String[] args) {
		Welcome welcome = new WelcomeDemo();
		welcome.hi();
		welcome.greet();
		Welcome.test();
	}
	@Override
	public void hi() {
		// TODO Auto-generated method stub

	}

}
