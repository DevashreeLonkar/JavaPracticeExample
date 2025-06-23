package StreamCodes;

//26 Find the union of two lists of integers

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionOfTwoLists {

	public static void main(String[] args) {
		
		List<Integer> list1= Arrays.asList(1,2,3,4,5,1,15);
		List<Integer> list2= Arrays.asList(11,12,13,14,15,1);
		
		System.out.println(Stream.of(list1,list2).flatMap(List::stream)
				.collect(Collectors.toList()));
		
		//Or
//		List<Integer> ans= Stream.concat(list1.stream(), list2.stream())
//				.collect(Collectors.toList());
	}
}
