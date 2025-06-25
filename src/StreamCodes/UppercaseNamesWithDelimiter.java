package StreamCodes;

//36 Transform Person object stream into a single string

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
public class UppercaseNamesWithDelimiter {

	public static void main(String[] args) {
      List<Person> list= Arrays.asList(
    		  new Person("Devashri", 28),
    		  new Person("Bob", 25),
              new Person("Charlie", 35)
    		  );
      String answers =  list.stream().map(x->x.name.toUpperCase())
      .collect(Collectors.joining(" | "));
      
      System.out.println(answers);
	}

}
