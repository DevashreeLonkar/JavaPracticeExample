package StreamCodes;

import java.util.Arrays;
import java.util.OptionalDouble;

//31 Calculate the average of all the numbers

public class AverageOfNumbers {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		double ans= Arrays.stream(arr).average().orElse(0.0);

		System.out.println(ans);
	}

}
