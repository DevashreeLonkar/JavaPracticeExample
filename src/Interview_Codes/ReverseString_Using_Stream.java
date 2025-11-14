package Interview_Codes;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString_Using_Stream {

	public static void main(String[] args) {
		String s= "Hello World";
		
		String reversed= IntStream.range(0, s.length())
				.mapToObj(i-> s.charAt(s.length() - 1 - i))
				.map(String::valueOf)
				.collect(Collectors.joining());

        System.out.println("Original: " + s);
        System.out.println("Reversed: " + reversed);
	}

}
