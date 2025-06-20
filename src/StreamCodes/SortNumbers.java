package StreamCodes;

//09 Arrange the numbers in Descending/Ascending Order

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(2,5,66,7,21,34,98,67);
		
		List<Integer> ascending= numbers.stream().sorted()
				.collect(Collectors.toList());
		
		System.out.println(ascending);

		
		List<Integer> descending= numbers.stream().sorted((a,b)-> b-a)
				.collect(Collectors.toList());
		
		System.out.println(descending);
	}

}
