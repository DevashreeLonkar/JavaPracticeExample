package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingAndDescendingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> aList= new ArrayList<Integer>();
		aList.add(5);
		aList.add(63);
		aList.add(77);
		aList.add(1);
		aList.add(32);
		aList.add(14);
		aList.add(99);

		System.out.println("Original ArrayList is:");
		for(Integer itr: aList) {
			System.out.println(itr);
		}
		
		ascending(aList);
		descending(aList);
	}

	private static void ascending(ArrayList<Integer> aList) {
		Collections.sort(aList);
		System.out.println("Ascending order is: ");
		for(Integer i:aList) {
			System.out.println(i);
		}
		
	}

	private static void descending(ArrayList<Integer> aList) {
		Collections.sort(aList, Collections.reverseOrder());
		System.out.println("Descending order is: ");
		for(Integer i:aList) {
			System.out.println(i);
		}
	}

}
