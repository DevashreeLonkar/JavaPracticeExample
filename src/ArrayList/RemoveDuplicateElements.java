package ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		ArrayList<Integer> aList= new ArrayList<>();
		aList.add(500);
		aList.add(85);
		aList.add(74);
		aList.add(21);
		aList.add(500);
		aList.add(74);
		aList.add(10);
		
		System.out.println("List is: " +aList);
		
		ArrayList<Integer> secondCopy= new ArrayList<>();
		secondCopy.addAll(aList);
		
		//Using LinkedHashSet
		removeDuplicateElements(aList);
		
		//Without Using LinkedHashSet
		removeDuplicates(aList);
	}
	
	public static void removeDuplicateElements(ArrayList<Integer> aList) {
		LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>(aList);
		System.out.println("Using LinkedHashSet: " +linkedHashSet);
	}
	
	public static void removeDuplicates(ArrayList<Integer> aList) {
		ArrayList<Integer> uniqueNum= new ArrayList<>();
		ArrayList<Integer> duplicateNum= new ArrayList<>();
		
		for(Integer num: aList) {
			if(uniqueNum.contains(num)) {
				duplicateNum.add(num);
			}
			else {
				uniqueNum.add(num);
			}
				
		}
		
		System.out.println("Unique List: " +uniqueNum);
		System.out.println("Duplicate List: " +duplicateNum);
	}
	
	
}
