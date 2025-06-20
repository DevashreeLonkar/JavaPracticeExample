package StreamCodes;

//Java 8 Stream API - 02 Remove duplicates from the string and return in the same order

import java.util.Arrays;

public class RemoveDuplicateAndReturnSameOrder {

	public static void main(String[] args) {
		
		String string= "dbacdfga";
		
		Arrays.stream(string.split("")).distinct().forEach(System.out::print);
	}

}
