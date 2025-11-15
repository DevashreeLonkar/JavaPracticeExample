package practicecodes;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReverse {

	public static void main(String[] args) {
		
		String s= "I Love India";
		
		String reverse= Arrays.stream(s.split(""))
				.reduce((a,b) -> b + a)
				.orElse("");		
		System.out.println("Way 1: "+reverse);
		
		String reversedWords = Arrays.stream(s.split(" "))
		        .map(str -> new StringBuilder(str).reverse().toString())
		        .collect(Collectors.joining(" "));

		System.out.println("Way 2: "+reversedWords);

		String reversed= "";
		for(int i= s.length() - 1; i>=0; i--) {
			reversed= reversed+ s.charAt(i);
		}
		System.out.println("Tradional way: "+reversed);
	}

}
