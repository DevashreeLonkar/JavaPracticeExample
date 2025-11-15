package practicecodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfElements {

	public static void main(String[] args) {
		
		int[] n= {1,2,3,4};
		
		Integer sum= Arrays.stream(n).boxed()
				.collect(Collectors.summingInt(x->x));
		
		System.out.println("Sum of all integers: "+sum);
	}

}
