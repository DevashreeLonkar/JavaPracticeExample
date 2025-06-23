package StreamCodes;

import java.util.stream.IntStream;

//18 Write a program to multiply 1st and last element, 2nd and 2nd last element

public class MultiplyMirrorPairs {

	public static void main(String[] args) {
		int[] arr= {4,1,3,4,5,2};
		
		IntStream.range(0, arr.length/2).map(x->arr[x] * arr[arr.length-x-1])
		.forEach(System.out::println);
		
	}

}
