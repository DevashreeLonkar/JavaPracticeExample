package StreamCodes;

import java.util.Arrays;
import java.util.List;

//Find the kth smallest element in a list of integers

public class KthSmallestElement {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,2,3,4);
		int k=3;
		
		int ans=  list.stream().sorted().skip(k-1).findFirst().get();

		System.out.println(ans);
	}

}
