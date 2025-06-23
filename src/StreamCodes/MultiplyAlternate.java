package StreamCodes;

import java.util.stream.IntStream;

//17 Write a stream program to multiply alternative numbers in an array

public class MultiplyAlternate {

	public static void main(String[] args) {
		int[] arr= {4,1,5,2,3,4,1};
		
		int ans= IntStream.range(0, arr.length).filter(x->x%2==0).map(x->arr[x])
				.reduce(1, (a,b)->a*b);
		
		System.out.println(ans);
		
	}

}
