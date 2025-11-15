package practicecodes;

import java.util.Arrays;

public class DistinctBoolean {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		
		boolean answer= Arrays.stream(a).boxed()
				.distinct().count()== a.length;
		
		System.out.println(answer);
	}

}
