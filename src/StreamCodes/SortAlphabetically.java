package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//23 Sort a list of strings in alphabetical order

public class SortAlphabetically {

	public static void main(String[] args) {
		String[] string= {"HNM", "ZARA", "Max", "Levis"};
		
	 List<String> sortedList= Arrays.stream(string).sorted().collect(Collectors.toList());
	 
	 System.out.println(sortedList);
	}

}
