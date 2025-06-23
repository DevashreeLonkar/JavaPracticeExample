package StreamCodes;

//25 Find and print the distinct odd numbers

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctOddNumbers {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(1,2,3,4,3,5,5,6,7,9,9,11);
		
		List<Integer> distinctOddsIntegers=	list.stream().filter(x->x%2!=0)
				.distinct().collect(Collectors.toList());
		
		System.out.println(distinctOddsIntegers);
	
	}

}
