package ArraysExamples;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] arr= {44,12,99,44,23,67,54,90};
		System.out.println("Original array: " +Arrays.toString(arr));

		int largeNo= findSecondLargest(arr);
		System.out.println("Second Largest array element is: " +largeNo);
	}

	public static int findSecondLargest(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp= arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[arr.length-2];
	}
}
