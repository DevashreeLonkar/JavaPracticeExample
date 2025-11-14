package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

//Problem:Group words by their starting letter and print them (using Method References).

public class GroupByFirstLetter {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banna", "apricot", "blueberry", "cherry", "avocado");
//		words.stream()
//        .collect(Collectors.groupingBy(s -> s.charAt(0), TreeMap::new, Collectors.joining(", ")))
//        .forEach((k, v) -> System.out.println(k + "-> " + v));
		
		System.out.println(words.stream()
		.collect(Collectors.groupingBy(x->x.charAt(0))));
	}

}
