package StreamCodes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//51 Return comparison of a Person object based on first name and then last name

public class ComparisonOfObject {

	public static void main(String[] args) {
		
		List<Personss> people= Arrays.asList(
				new Personss("Bobby", "Smith"),
				new Personss("Bobby", "Adams"),
				new Personss("John", "Smith"),
				new Personss("Alice", "Johnson")
				);
		
		 List<Personss> sorted = people.stream()
	                .sorted(Comparator.comparing((Person p) -> p.firstName)
	                                  .thenComparing(p -> p.lastName))
	                .collect(Collectors.toList());

	        sorted.forEach(System.out::println);
		
		

	}

}
