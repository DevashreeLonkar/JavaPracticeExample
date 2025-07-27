package StringExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityClass {

	public static void main(String[] args) {
		// Creating a List of integers
		List<Integer> list= new ArrayList<>(Arrays.asList(61,23,31,34,5,76,89,0,5));

		System.out.println(list);
		
		 // 1️. Sorting the list in ascending order
		Collections.sort(list);
		System.out.println("List in ascending order: " +list);
		
		 // 2️. Sorting the list in descending order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("List in descending order: " +list);
		
		// 3️. Reversing the list
		Collections.reverse(list);
		System.out.println("Reverse list: " +list);
		
		// 4️. Shuffling the list (Random Order)
		Collections.shuffle(list);
		System.out.println("Shuffled list: " +list);
		
		// 5️. Finding Maximum & Minimum Elements
		System.out.println("Max element is: " +Collections.max(list));
		System.out.println("Min element is: " +Collections.min(list));
		
		 // 6️. Counting Frequency of an Element
		System.out.println("Frequency of 5: " +Collections.frequency(list, 5));
		
		// 7️. Performing Binary Search (List must be sorted first)
		Collections.sort(list);
		int index= Collections.binarySearch(list, 5);
		System.out.println("Index of 5(binary search): " +index);
		
		 // 8️. Making the List Unmodifiable (Immutable)
		List<Integer> unmodifiaIntegers= Collections.unmodifiableList(list);
		System.out.println("Unmodifiable list: " +unmodifiaIntegers);
		//unmodifiaIntegers.add(10); // ❌ Throws Exception: UnsupportedOperationException
		
		// 9️. Making a Synchronized List (Thread-Safe)
		List<Integer> synchonizedList= Collections.synchronizedList(new ArrayList<>(list));
		
		// Accessing synchronizedList in a synchronized block
		synchronized (synchonizedList) {
			for(int num: synchonizedList) {
				System.out.println(num +" ");
			}
			System.out.println("Synchronized list accessed");
		}
	}

}
