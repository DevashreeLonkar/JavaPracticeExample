package practicecodes;

import java.util.Arrays;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String s= "Hello World";
		
		String outputChar= Arrays.stream(s.split(""))
				.filter(x->s.indexOf(x) == s.lastIndexOf(x))
				.findFirst().get();
		
		System.out.println("First Non-Repeated Char: " +outputChar);
	}

}
