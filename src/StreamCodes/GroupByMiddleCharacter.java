package StreamCodes;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//21 Given the string[] group the strings based on the middle character

public class GroupByMiddleCharacter {

	public static void main(String[] args) {
		
		String[] s= {"ewe", "rwr", "lol", "mom", "abc", "abs", "zzz"};
		
		System.out.print(Stream.of(s).collect(Collectors.groupingBy(x->x.toString().substring(1, 2))));
	}

}
