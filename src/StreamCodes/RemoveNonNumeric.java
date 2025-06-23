package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//28 Remove all non-numeric characters from a list

public class RemoveNonNumeric {

	public static void main(String[] args) {
		List<String> list= Arrays.asList("abs32a", "w2231x", "ej7nde");
		
		List<String> ans= list.stream().map(x->x.replaceAll("[^0-9]", ""))
		.collect(Collectors.toList());
		
		System.out.println(ans);
	}

}
