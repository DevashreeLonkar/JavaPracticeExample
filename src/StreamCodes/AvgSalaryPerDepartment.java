package StreamCodes;

//54 Find the average salary from each department

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgSalaryPerDepartment {

	public static void main(String[] args) {
		   List<Emps> employees = Arrays.asList(
		            new Emps("Alice", "HR", 50000),
		            new Emps("Bob", "IT", 70000),
		            new Emps("Charlie", "HR", 55000),
		            new Emps("Diana", "Finance", 60000),
		            new Emps("Eve", "IT", 80000),
		            new Emps("Frank", "IT", 75000)
		        );

		  Map<String, Double> ansMap= employees.stream().collect(Collectors.groupingBy(Emps::getDepartment, 
				   Collectors.averagingDouble(x->x.salary)));
		   
		  System.out.println(ansMap);
		   
	}

}
