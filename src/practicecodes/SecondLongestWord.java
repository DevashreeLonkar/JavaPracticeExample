package practicecodes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondLongestWord {

	public static void main(String[] args) {
		String s= "Find the Second Longest word of the String";

	String secondLongestWord= Arrays.stream(s.split("\\s+"))
				.sorted(Comparator.comparingInt(String::length).reversed())
				.skip(1).findFirst().get();
	System.out.println("Second longest word is: " +secondLongestWord);
				

	}

}
