package practicecodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoLists {

	public static void main(String[] args) {
		
		List<Integer> list1= Arrays.asList(1,2,3,4,5);
		List<Integer> list2= Arrays.asList(1,2,4,6);
		
		System.out.println(list1.stream().filter(x->list2.contains(x)).collect(Collectors.toList()));
		
		

	}

}
