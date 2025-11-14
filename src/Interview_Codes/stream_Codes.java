package Interview_Codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class stream_Codes {

	public static void main(String[] args) {
		//03 Find the word that has the second highest length
		
		String s= "I am learning Stream API in Java";
		String anString= Arrays.stream(s.split(" ")).distinct()
				.sorted(Comparator.comparing(String::length).reversed())
				.skip(1).findFirst().get();
		
		System.out.println(anString);
				
	}
}
