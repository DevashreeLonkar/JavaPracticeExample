package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//53 Find the department with maximum people

public class CountEmplyoeeInDepartment {

	public static void main(String[] args) {
		
		List<Emplyoe> employees = Arrays.asList(
	            new Emplyoe("Alice", "HR"),
	            new Emplyoe("Bob", "IT"),
	            new Emplyoe("Charlie", "HR"),
	            new Emplyoe("Diana", "Finance"),
	            new Emplyoe("Eve", "IT"),
	            new Emplyoe("Frank", "IT")
	        );
		
	Map<String, Long> map=	employees.stream().collect(Collectors.groupingBy(Emplyoe::getDepartment, Collectors.counting()));

	Optional<Map.Entry<String, Long>> ansOptional= map.entrySet().stream().max(Map.Entry.comparingByValue());
	
	  ansOptional.ifPresent(entry -> 
      System.out.println("Department with most people: " + entry.getKey() + " → " + entry.getValue()));
	}

}
