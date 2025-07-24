package ArraysExamples;

import java.util.Arrays;

public class SumOfAllElement {

	public static void main(String[] args) {
		int[] array= {10,20,30,40,50};
		System.out.println("Original array: " +Arrays.toString(array));

	int sumOfAll= sumAll(array);
		System.out.println("Sum of all numbers: " +sumOfAll);
	}
	
	public static int sumAll(int[] array) {
		int a=0;
		for(int i=0; i<array.length; i++) {
			a+=array[i];
		}
		return a;
	}

}
