package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//30 Convert a list of strings to uppercase

public class ConvertToUpperCase {

	public static void main(String[] args) {
		List<String> list= Arrays.asList("friends", "abc", "xyz", "BB");
		
		List<String> ans=	list.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(ans);
	}
}
