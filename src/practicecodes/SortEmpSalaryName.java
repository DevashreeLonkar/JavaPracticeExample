package practicecodes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpSalaryName {

	public static void main(String[] args) {

		List<Emplyoee> employees = Arrays.asList(
		        new Emplyoee("Devashree", 50000.0),
		        new Emplyoee("Aditi", 45000.0),
		        new Emplyoee("Riya", 50000.0),
		        new Emplyoee("Neha", 40000.0)
		);
		
	List<Emplyoee> empList=	employees.stream().sorted(Comparator.comparing(Emplyoee::getSalary)
				.thenComparing(Emplyoee::getName)).collect(Collectors.toList());
	
	List<Emplyoee> empWithMoreSalary= employees.stream()
			.filter(x->x.getSalary() > 45000).collect(Collectors.toList());
	
	empWithMoreSalary.forEach(System.out::println);
	System.out.println("--------------------------------------------");
	empList.forEach(System.out::println);
	}

}
