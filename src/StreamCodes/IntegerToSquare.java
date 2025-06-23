package StreamCodes;

//24 Convert a list of integers to a list of their squares

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerToSquare {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4);
		
		List<Integer> squares= list.stream().map(x->x*x).collect(Collectors.toList());
		
		System.out.println(squares);
	}

}
