package StreamCodes;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//16 Group /Pair anagrams from a list of Strings

public class GroupAnagrams {

	public static void main(String[] args) {
		List<String> words= Arrays.asList("listen", "Silent", "enlist", "Hello", "below", "Elbow", "cat", "act");
		
	Collection<List<String>> ans= words.stream().collect(Collectors.groupingBy(x->Arrays.stream(x.toLowerCase()
				.split("")).sorted().collect(Collectors.toList()))).values();
	
	System.out.println(ans);
	}

}
