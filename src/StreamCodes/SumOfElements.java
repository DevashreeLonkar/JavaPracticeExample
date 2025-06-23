package StreamCodes;

//22 Find the sum of all the elements in a list

import java.util.Arrays;
import java.util.List;

public class SumOfElements {

	public static void main(String[] args) {
		
		List<Integer> s= Arrays.asList(1,2,3,4,5);
		
		int sum= s.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

}
