package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintSecondLast {

	public static void main(String[] args) {
		List<String> list= Arrays.asList("One", "Two", "Three");
		 String nameString = list.stream()
				.skip(list.size() - 2)
				.findFirst().get();
		 System.out.println(nameString);

	}

}
