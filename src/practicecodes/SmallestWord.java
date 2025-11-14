package practicecodes;

import java.util.Arrays;
import java.util.Comparator;

public class SmallestWord {

	public static void main(String[] args) {
		String s= "Find the Longest word of a String";
		
		String smallestWord= Arrays.stream(s.split("\\s+"))
				.sorted(Comparator.comparingInt(String::length))
				.findFirst().get();

		System.out.println("Smallest word: " +smallestWord);
	}

}
