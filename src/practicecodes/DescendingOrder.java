package practicecodes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {

	public static void main(String[] args) {
		int[] b= {1,4,77,2,3,0,45,76};
		
		List<Integer> sortDesc= Arrays.stream(b).boxed()
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("Descending order: "+sortDesc);
			

	}

}
