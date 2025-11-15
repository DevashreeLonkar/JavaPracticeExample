package practicecodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoiningObject {

	public static void main(String[] args) {
		List<Person> peopleList= Arrays.asList(
				new Person("Devashree", 27L, "Pune"),
				new Person("Devashri", 25L, "Mumbai"),
				new Person("Devu", 26L, "Chinchwad")
				);
		
		String result= peopleList.stream()
				.map(Person::toString)
				.collect(Collectors.joining("|"));
		
		System.out.println(result);

		List<Person> getAgeString= peopleList.stream()
				.filter(x->x.getAge()>25).collect(Collectors.toList());
		System.out.println(getAgeString);
	}

}
