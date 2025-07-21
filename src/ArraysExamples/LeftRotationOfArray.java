package ArraysExamples;

import java.util.Arrays;

public class LeftRotationOfArray {

	public static void main(String[] args) {
	String[] array= {"Devashree","Ravi","Priya","Shriya"};
	System.out.println("Original array: " +Arrays.toString(array));
	leftRotation(array);
	}
	
	public static void leftRotation(String[] array) {
		String temp= array[0];
		
		for(int i=0; i<array.length-1; i++) {
			array[i] = array[i+1];
		}
		
		array[array.length-1]= temp;
		System.out.println("Rotation array: " +Arrays.toString(array));	
	}

}
