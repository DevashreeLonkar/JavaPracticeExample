package LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample3 {

	public static void main(String[] args) {
		//Creating linkedlist of Integers
		LinkedList<Integer> list= new LinkedList<>();
		list.add(111);
		list.add(112);
		list.add(113);
		list.add(114);
		list.add(115);
		list.add(116);
		list.add(117);
		list.add(118);
		System.out.println("List of Integers: "+list);

		// Adding elements at specific positions
//		list.add(0, 110);
//		System.out.println("Added element at 0th position: " +list);
		
		list.push(110); //add first
		list.addFirst(109); //add first
		list.addLast(119); //add last
		
		System.out.println("After adding first & last: " +list);
		
		//Removing elements
		list.removeFirst(); //removes first
		list.removeLast(); //removes last
		list.remove(0);
		
		System.out.println("After removing first & last: " +list);
		
		//Peek- Retrieve but do not remove the element(First element)
		System.out.println("Peek element is: "+list.peek());
		
		//Peek last
		System.out.println("Peek last element: " +list.peekLast());
		
		 // Pop (removes and returns first element)
		System.out.println("Pooped element is: "+list.pop());
		System.out.println("After pop operation list is: "+list);
		
		// Adding a collection (addAll)
		LinkedList<Integer> list1= new LinkedList<>(Arrays.asList(120,121,122,123,128,125,124));
		list.addAll(list1);
		System.out.println("After add all list is: " +list);
		
		// Getting a sublist
		List<Integer> subList= list.subList(0, 3);
		System.out.println("Sublist from 0 to 3 is: " +subList);
		
		// Sorting the list
		Collections.sort(list);
		System.out.println("Sorted list: "+list);
		
		// Sorting with custom comparator (Descending order)
		list.sort(Comparator.reverseOrder());
		System.out.println("List in descending: "+list);
		
		// Retrieving elements without removal
		System.out.println("Getting first element: " +list.getFirst());
		System.out.println("Gettig last element: " +list.getLast());
		
		list.set(0, 100);
		System.out.println("At 0th position: "+list);
		
	}

}
