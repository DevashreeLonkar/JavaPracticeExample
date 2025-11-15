package practicecodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Remove Numeric and Non Numeric from the list

public class RemoveNumericAndNonNumeric {

	public static void main(String[] args) {
		String strings[]= {"a2e", "aa1", "j9j", "l0l", "L9L"};

		List<String> removeNumbers= Arrays.stream(strings)
				.map(x->x.replaceAll("[0-9]+", "")).collect(Collectors.toList());
		
		System.out.println("After removing Numbers from List: "+removeNumbers);
		
		List<String> removingAlphabets= Arrays.stream(strings)
				.map(x->x.replaceAll("[a-z&A-Z]+", "")).collect(Collectors.toList());
		
		System.out.println("After removing Alphabets from List: "+removingAlphabets);
	}

}
