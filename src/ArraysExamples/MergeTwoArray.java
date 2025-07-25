package ArraysExamples;

public class MergeTwoArray {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {6,7,8,9,10};
		
		int[] merged= new int[arr1.length + arr2.length];
		
		//Copy elements from arr1
		for(int i=0; i<arr1.length; i++) {
			merged[i]= arr1[i];
		}
		
		//Copy elements from arr2
		for(int i=0; i<arr2.length; i++) {
			merged[arr1.length +  i]= arr2[i];
		}
		
		//Print the merged array
		for(int num: merged) {
			System.out.print(num + " ");
		}
	}

}
