package StreamCodes;

//56 Return character with the maximum frequency

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringMaxFrequency {

	public static void main(String[] args) {
		
		String s= "javadeveloper";
		
		char ch= s.chars().  //converts to Intstream
				mapToObj(c->(char) c).  //converted to character
				collect(Collectors.groupingBy(x->x, Collectors.counting())).  //created our frequency map
				entrySet().stream().
				max(Map.Entry.comparingByValue()).
				map(Map.Entry::getKey).
				orElse(null);
				
		System.out.println(ch);
	}

}
