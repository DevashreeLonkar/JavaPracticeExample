package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//32 Find the intersection of two lists using Java streams 

public class IntersectionOfLists {

	public static void main(String[] args) {
		
		List<Integer> l1= Arrays.asList(1,2,3,4,5);
		List<Integer> l2= Arrays.asList(3,4,5,6);
		
		List<Integer> ansIntegers= l1.stream().filter(l2::contains).collect(Collectors.toList());
		
		System.out.println(ansIntegers);
	}

}
