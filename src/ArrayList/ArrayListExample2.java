package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		//1. Creating ArrayList
		ArrayList<String> subject= new ArrayList<String>();
		
		subject.add("C");
		subject.add("C++");
		subject.add("C#");
		subject.add("Java");
		subject.add("SpringBoot");
		subject.add("SQL");
		subject.add("HTML");
		subject.add("CSS");
		
		//2. List of subjects
		System.out.println("List of subjects: " +subject);
		
		//3. Add element at specific location
		subject.add(1, "JS");
		System.out.println("Adding at position 2: " +subject);
		
		//4. Adding another list
		ArrayList<String> fruits= new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Apple");
		fruits.add("Chickoo");
		
		subject.addAll(fruits);
		System.out.println("After adding another list: " +subject);
		
		//5.Updating an element
		subject.set(1, "Avacado");
		System.out.println("After updating an element: " +subject);
		
		//6. Removing an element
		subject.remove("C");
		System.out.println("List After removing an element: " +subject);
		subject.remove(3);
		System.out.println("List After removing an index element: " +subject);
		
		//7. Check if an element exists
		System.out.println("Contains Apple? " +subject.contains("Apple"));
		
		//8. Finding index of an element
		System.out.println("Index is :" +subject.indexOf("Kiwi"));
		
		//9. Sorting a list
		Collections.sort(subject);
		System.out.println("Sorted list: " +subject);
		
		//10. Reverse a list
		Collections.reverse(subject);
		System.out.println("Reversed list: " +subject);
		
		//11. Iteration
		for(String subject1: subject) {
			System.out.println("List printed using Iteration:" +subject1);
		}
		
		//12. Iteration using Iterator
		System.out.println("Iteration using Iterator");
		Iterator<String> iterator= subject.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());		
			}
		
		//13. Sublist
		ArrayList<String> sublist= new ArrayList<String>(subject.subList(1, 5));
		System.out.println("Sublist is:" +sublist);
		
		//14. Converting to an array
		String[] array= subject.toArray(new String[0]);
		System.out.println("Converted to an array");
		for(String s: array) {
			System.out.print(s +"\t");
		}
		System.out.println();
		
		//15. Value swap
		Collections.swap(sublist, 1, 2);
		System.out.println("After swapping the List is:" +sublist);
		
		//16. Last index print
		System.out.println("Last index is:" +sublist.lastIndexOf(iterator));
		
		
		//17. toArray() - Convert ArrayList to Array
		String[] fruitArray= subject.toArray(new String[0]);
		System.out.println("Array from ArrayList: " +Arrays.toString(fruitArray));
		
		//18. asList() - Convert Array to List (Fixed-size list)
		List<String> fruitList= Arrays.asList(fruitArray);
		System.out.println("List from Array:" +fruitList);
		
		//19. toString() - Convert ArrayList to String
		System.out.println("ArrayList as String: " +fruitList.toString());
		
		//20. lastIndexOf() - Find the last occurrence of an element
		int lastIndex= fruitList.lastIndexOf("CSS");
		System.out.println("Last Index of CSS is:" +lastIndex); 
		
		//21. clone() - Create a shallow copy of ArrayList
		ArrayList<String> clonnedList= (ArrayList<String>) subject.clone();
		System.out.println("Cloned ArrayList: " +clonnedList);
		
		//22. Clearing the list
		fruitList.clear();
		System.out.println("Cleared List");
		
		//23. Checking if the list is empty
		System.out.println("Checking if List is empty:" +fruitList.isEmpty());
	}
}
