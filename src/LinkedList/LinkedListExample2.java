package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		
		//Displaying list
		System.out.println("Integer list: " +list);

		LinkedList<String> names= new LinkedList<>();
		names.add("Devashree");
		names.add("Priyanka");
		names.add("Ravi");
		names.add("Siddhi");
		
		//Displaying list
		System.out.println("Names list: " +names);
		
		//Accessing element
		System.out.println("Element at 0 position: "+names.get(0));
		
		//Removing an element
		names.remove(2);
		System.out.println("Removing at 2nd position: "+names);
		
		//Iterating over list
		System.out.println("Iteration list: ");
		for(String namesList: names) {
			System.out.println(namesList);
		}
	}

}
