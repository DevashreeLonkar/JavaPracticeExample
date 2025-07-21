package ArraysExamples;

public class FindPositiveElementAverage {

	public static double findPositiveAverage(int[] arr) {
		int sum=0;
		int count=0;
		
		for(int num: arr) {
			if(num > 0) {
				sum+= num;
				count++;
			}
		}
		if(count==0) {
			System.out.println("No positive elements in array");
			return 0;
		}
		return (double)sum/count;
	}
	
	public static void main(String[] args) {
		int[] arr1= {4,-1,2,-1,0};
		System.out.println("Average of first array is: " +findPositiveAverage(arr1));

	}

}
