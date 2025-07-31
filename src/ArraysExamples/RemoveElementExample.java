package ArraysExamples;

import java.util.Arrays;

public class RemoveElementExample {

	public static void main(String[] args) {
		int[] original= {1,2,3,4,5,5};
		int valueToRemove= 5;
		
		// Count occurrences of the value to remove
		int count=0;
		for(int num: original) {
			if(num == valueToRemove) {
				count++;
			}
		}
		
		// Create a new array of the correct size
		int[] newArray= new int[original.length - count];
		int index=0;
		
		for(int num : original) {
			if(num != valueToRemove) {
				newArray[index++] = num;
			}
		}
		
		System.out.println("Original: " + Arrays.toString(original));
        System.out.println("After removing " + valueToRemove + ": " + Arrays.toString(newArray));

	}

}
