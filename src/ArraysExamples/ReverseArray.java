package ArraysExamples;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println("Original array: " +Arrays.toString(arr));

		int[] newArray= reversedArray(arr);
		System.out.println("Reversed array: " +Arrays.toString(newArray));
		
	}

	public static int[] reversedArray(int[] arr) {
		int[] newArray= new int[arr.length];
		for(int i=0; i< arr.length; i++) {
			newArray[arr.length-1-i]= arr[i];
		}
		return newArray;
	}
}
