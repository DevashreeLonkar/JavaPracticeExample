package practicecodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingSort {

	public static void main(String[] args) {
		int[] a= {4,7,1,2,0,55,33,11};
		
		List<Integer> sortAsc= Arrays.stream(a).boxed().sorted()
				.collect(Collectors.toList());

		System.out.println("Ascending order: "+sortAsc);
	}

}
