package Interview_Codes;

import java.util.stream.IntStream;

public class PairWithSumStream {

	public static void main(String[] args) {
		 int[] arr = {1, 5, 7, -1, 5};
	     int target = 6;
	     
	     IntStream.range(0, arr.length)
	     .boxed()
	     .flatMap(i -> IntStream.range(i + 1, arr.length)
	     .filter(j-> arr[i] + arr[j] == target)
	     .mapToObj(j-> "(" +arr[i]+ ", " +arr[j]+ ")")
	      ).forEach(System.out::println); {
			
		}  

	}

}
