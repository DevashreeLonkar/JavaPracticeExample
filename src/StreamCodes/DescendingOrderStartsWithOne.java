package StreamCodes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//49 Print distinct numbers which starts with "1" in descending order

public class DescendingOrderStartsWithOne {

	public static void main(String[] args) {
		//int arr[]= {12,34,11,34,67,121,52,78,114,565,1643,11};

		List<Integer> list= Arrays.asList(12,34,11,34,67,121,52,78,114,565,1643,11);
		
		List<String> answerIntegers=	list.stream().map(String::valueOf)
		.filter(x->x.startsWith("1"))
		.distinct()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		
		System.out.println(answerIntegers);
	}

}
