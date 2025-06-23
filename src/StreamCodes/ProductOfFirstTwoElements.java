package StreamCodes;

import java.util.Arrays;

//15 Find the products of the first two elements in an array

public class ProductOfFirstTwoElements {

	public static void main(String[] args) {
		int[] arr= {12,5,4,2};
		
		int ans= Arrays.stream(arr).boxed().limit(2).reduce(1, (a,b)->a*b);

		System.out.println(ans);
	}

}
