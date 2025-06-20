package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//07 Divide given integer list into lists of even and odd numbers 

public class SplitEvenOdd {

	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(2,3,4,5,6,7,8,9,10);

		Map<Boolean, List<Integer>> partitioned= numbers.stream()
				.collect(Collectors.partitioningBy(x->x%2==0));
		
		List<Integer> even= partitioned.get(true);
		List<Integer> odd= partitioned.get(false);
		
		System.out.println("Even:" +even);
		System.out.println("Odd:" +odd);
	}

}
