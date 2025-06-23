package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//20 In a given array of integers, return true if it contains distinct values

public class DistinctValues {

	public static void main(String[] args) {

		int[] arr= {1,2,3};
		
		boolean allDistinct= Arrays.stream(arr).boxed()
				.collect(Collectors.toSet()).size()==arr.length;
		
		System.out.println("All are Distinct: " +allDistinct);
	}

}
