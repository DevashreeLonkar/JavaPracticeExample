package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student1{
	int id;
	String name;
	double percentage;
	int age;
	public Student1(int id, String name, double percentage, int age) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + ", age=" + age + "]";
	}
}
public class GenericStudentExmaple {

	public static void main(String[] args) {
		 // Creating a generic collection (ArrayList of Students)
		ArrayList<Student1> studentList= new ArrayList<>();
		studentList.add(new Student1(1, "Devashree", 80.5, 26));
		studentList.add(new Student1(2, "ABC", 60, 20));
		studentList.add(new Student1(3, "XYZ", 95, 28));
		
		// Iterating through the list and printing student details
		for(Student1 stuDetails: studentList) {
			System.out.println("Student list is: " +stuDetails);
		}
		
		 //Iterate using Stream API
		List<String> names= studentList.stream()
				.map(s -> s.name)
				.collect(Collectors.toList());
		
		System.out.println("Student names: " +names);
	}

}
