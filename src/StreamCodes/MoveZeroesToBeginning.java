package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//19 Write a stream program to move all zero’s to beginning of array

public class MoveZeroesToBeginning {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,0,8,9,3,0,3,2,0,0);
		
		List<Integer> result= Stream.concat
				(list.stream().filter(x->x==0), list.stream().filter(x->x!=0))
						.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
