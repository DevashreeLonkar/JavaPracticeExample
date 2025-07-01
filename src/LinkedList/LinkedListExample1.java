package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list= new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.addFirst(0);
		list.addLast(6);
		
		System.out.println(list);
		
		list.getFirst();
		list.getLast();
		
		list.removeIf(x->x%2==0);
		System.out.println(list);
		
		LinkedList<String> animals= new LinkedList<> (Arrays.asList("Cat", "dog", "elephant"));
		LinkedList<String> removeAnimals= new LinkedList<> (Arrays.asList("dog"));
		
		animals.removeAll(removeAnimals);
		System.out.println(animals);
		
	}

}
