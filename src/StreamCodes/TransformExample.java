package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//58 Transform one object into another . Transform Employee to EmployeeDTO

public class TransformExample {

	public static void main(String[] args) {
		 List<Emp> employees = Arrays.asList(
		            new Emp(1, "Alice", "HR", 50000),
		            new Emp(2, "Bob", "IT", 60000),
		            new Emp(3, "Charlie", "Finance", 55000)
		        );

		List<EmpDTO> empDTOs= employees.stream().map(e->new EmpDTO(e.id, e.name)).collect(Collectors.toList());
		
		System.out.println(empDTOs);
	}

}
