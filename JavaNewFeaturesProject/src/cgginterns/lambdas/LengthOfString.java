package cgginterns.lambdas;

public class LengthOfString {
	public static void main(String[] args) {
		MyInterface6 i6 = msg->{
			return msg.length();
		};
		System.out.println(i6.findLen("divya"));
	}

}
