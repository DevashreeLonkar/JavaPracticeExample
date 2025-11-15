package practicecodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfUniqueElements {

	public static void main(String[] args) {
		int[] a= {1,1,2,3,4,1};
		
		Integer sumOfUnique= Arrays.stream(a).boxed()
				.distinct().collect(Collectors.summingInt(x->x));

//		int sumOfUnique= Arrays.stream(a).filter(x-> Arrays.stream(a).filter(y-> y==x)
//				.count() == 1).sum();
		System.out.println(sumOfUnique);
	}

}
