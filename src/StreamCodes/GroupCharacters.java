package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 37 Group list of strings by their first character and count the number of strings

public class GroupCharacters {

	public static void main(String[] args) {

		List<String> list= Arrays.asList("Apple", "Banana", "Cake", "Apricot", "Batball", "Cat");
		
		Map<Character, Long> anStrings=	list.stream()
				.collect(Collectors.groupingBy(x->x.charAt(0), Collectors.counting()));
		System.out.println(anStrings);

	}

}
