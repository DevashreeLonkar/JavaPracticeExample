package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Devashree");
		list.add("Devu");
		
		//Displaying list
		System.out.println("Names: " +list);
		
		//Accessing specific element
		System.out.println("First name: " +list.get(0));
		
		//Removing an element
		list.remove("Devu");
		System.out.println(list);
		
		//Iterating the list
		System.out.println("Iterating the list");
		for(String name: list) {
			System.out.println(name);
		}

	}

}
