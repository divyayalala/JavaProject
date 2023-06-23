package cgginterns.optional;

import java.util.Optional;

public class OptionalExample {
	
	public static Optional<String> getName(){
		String name = "abc";
		return Optional.ofNullable(name);
		
	}
	
	public static void main(String[] args) {
		String str = "this is java";
		Optional<String> ofNullable = Optional.ofNullable(str);
		System.out.println(ofNullable.isPresent());
		//System.out.println(ofNullable.get());
		
		System.out.println(ofNullable.orElse("other is returned"));
		
		Optional<String> name = getName();
		System.out.println(name.orElse("null returned"));
	}

}
