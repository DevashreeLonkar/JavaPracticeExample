package StreamCodes;

//10 Given an array, find the sum of unique elements
import java.util.Arrays;

public class SumOfUniqueElements {

	public static void main(String[] args) {
		
		int arr[]= {1,2,8,3,4,4,1,8};
		
		int ans= Arrays.stream(arr).distinct().sum();
		
		System.out.println(ans);

	}

}
