package practicecodes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortAlphabetically {

	public static void main(String[] args) {
		String[] string= {"Zudio", "Westside", "Zara", "Max"};

		List<String> sort= Arrays.stream(string)
				.sorted().collect(Collectors.toList());
		
		System.out.println("Sorted Alphabetically: "+sort);
		
		List<String> reverseSort= Arrays.stream(string)
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("Reverse Sort : "+reverseSort);
	}

}
