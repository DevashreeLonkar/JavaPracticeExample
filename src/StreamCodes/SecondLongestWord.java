package StreamCodes;

//03 Find the word that has the second highest length

import java.util.Arrays;
import java.util.Comparator;

public class SecondLongestWord {

	public static void main(String[] args) {
		String s= "I am learning Stream API in Java";
	String str= Arrays.stream(s.split(" ")).distinct()
		.sorted(Comparator.comparing(String::length).reversed())
		.skip(1).findFirst().orElse(null);
		
		System.out.println(str);
	}

}
