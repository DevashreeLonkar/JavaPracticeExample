package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//35 Convert list of integers to a list of their squares

public class IntegerToSquares {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		
		List<Integer> ansIntegers= list.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(ansIntegers);
	}

}
