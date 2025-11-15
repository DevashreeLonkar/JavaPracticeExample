package practicecodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOfString {

	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("Apple", "banana", "kiwi");
		
		Map<String, Integer> map= list.stream()
				.collect(Collectors.toMap(x->x, x->x.length()));
		System.out.println(map);

	}

}
