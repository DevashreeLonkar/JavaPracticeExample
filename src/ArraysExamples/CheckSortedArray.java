package ArraysExamples;

public class CheckSortedArray {
		
		 public static boolean isSorted(int[] arr) {
				
				for(int i=0; i<arr.length; i++) {
					if(arr[i]<arr[i+1]) {
						return false;
					}
				}
				return true; 
		 }
	
		 public static void main(String[] args) {
				int number[]= {2,4,1,10,2,3};
				System.out.println("Is Array sorted? " +isSorted(number));
			 
	}

}
