package practicecodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstChar {

	public static void main(String[] args) {

		String[] strings= {"Blue", "Red", "Black", "Orange", "rrf", "ofgh"};

		Map<Object, List<String>> output= Arrays.stream(strings).map(x->x.toUpperCase())
				.collect(Collectors.groupingBy(x->x.charAt(0)));
		System.out.println(output);
	}

}
