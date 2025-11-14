package practicecodes;

import java.util.Arrays;
import java.util.Optional;

public class LongestWords {

	public static void main(String[] args) {
		String s= "Find the Longest word of the String";
		
		Optional<String> longestWord= Arrays.stream(s.split("\\s+"))
				.max((x,y)-> Integer.compare(x.length(), y.length()));
		
		if (longestWord.isPresent()) {
            System.out.println("Longest word is: " + longestWord.get());
            System.out.println("Length is: " + longestWord.get().length());
        }
	}

}
