package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//41 Convert a list of string to uppercase and then concatenate

public class ToUpperCaseAndConcatenate {

	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("A", "B", "C", "D");
		String ansList= list.stream().map(String::toUpperCase).collect(Collectors.joining());
		
		System.out.println(ansList);
	}

}
