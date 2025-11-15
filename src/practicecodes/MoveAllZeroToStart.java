package practicecodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveAllZeroToStart {

	public static void main(String[] args) {
		int[] a= {2,7,0,2,4,6,0,1,1,0,0,0,3,7,0};

		//List<Integer> answer= Arrays.stream(a).boxed().sorted().collect(Collectors.toList());
		
		List<Integer> answer1= Arrays.stream(a).boxed()
				.filter(x-> x==0).collect(Collectors.toList());
		
		List<Integer> answer2= Arrays.stream(a).boxed()
				.filter(x->x!=0).collect(Collectors.toList());
		
		System.out.println("All Zero's to start Final answer: " +answer1 +answer2);
	}

}
