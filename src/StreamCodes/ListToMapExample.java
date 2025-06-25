package StreamCodes;

import java.util.*;
import java.util.stream.Collectors;

class Personn {
    String name;
    int age;
    Personn(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListToMapExample {

	public static void main(String[] args) {
		List<Personn> people = Arrays.asList(
	            new Personn("Alice", 30),
	            new Personn("Bob", 25),
	            new Personn("Charlie", 35)
	        );
		
	Map<String, Integer> map= people.stream().collect(Collectors.toMap(p->p.name, p->p.age));
	System.out.println(map);
	}

}
