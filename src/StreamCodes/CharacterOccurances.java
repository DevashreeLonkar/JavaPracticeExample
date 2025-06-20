package StreamCodes;

//08 Given a word, find the occurrence of each character

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterOccurances {

	public static void main(String[] args) {
		String string= "Mississippi";
		
		Map<String, Long> chatOccurances= Arrays.stream(string.split(""))
				.collect(Collectors.groupingBy(x->x, Collectors.counting()));
		
		System.out.println(chatOccurances);

	}

}
