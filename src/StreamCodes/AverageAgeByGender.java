package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageAgeByGender {

	public static void main(String[] args) {
		
		 List<Emplyoee> employees = Arrays.asList(
		            new Emplyoee("Alice", 30, "Female"),
		            new Emplyoee("Bob", 25, "Male"),
		            new Emplyoee("Charlie", 28, "Male"),
		            new Emplyoee("Diana", 32, "Female")
		        );
		 
		 Map<String, Double> avgAgeByGender = employees.stream()
		            .collect(Collectors.groupingBy(
		                e -> e.gender,
		                Collectors.averagingInt(e -> e.age)
		            ));

		        avgAgeByGender.forEach((gender, avgAge) ->
		            System.out.println(gender + " → Average Age: " + avgAge));
		    } 


	}
