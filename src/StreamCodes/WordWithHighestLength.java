package StreamCodes;


//Java 8 Stream API - 01 Given a sentence, find the word that has the highest length

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class WordWithHighestLength {

	public static void main(String[] args) {
		String string= "I am learning java";
		
		String ans= Arrays.stream(string.split(" "))
				.max(Comparator.comparing(String::length)).get();
		
		System.out.println(ans);

	}

}
