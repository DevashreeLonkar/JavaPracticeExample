package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//13 Given an array of integers, group the numbers by the range

public class GroupNumberByRange {

	public static void main(String[] args) {
		int[] arr= {1,2,3,11,12,14,22,26,29,33,38,39,41,40,50,52,55};
		
		Map<Integer, List<Integer>> mapList= Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(x->x/10*10));
		
		System.out.println(mapList);

	}

}
