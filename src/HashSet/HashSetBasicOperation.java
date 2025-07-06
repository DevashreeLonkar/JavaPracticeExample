package HashSet;

import java.util.HashSet;
import java.util.Iterator;

//No Insertion Order Maintain
//No Duplicate Element
//Null Allowed but for only one time
//Faster for Searching Operation
//Non Synchronized

public class HashSetBasicOperation {
	public static void main(String[] args) {
		
		HashSet<String> fruitSet= new HashSet<>();
		fruitSet.add("Mango");
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Berry");
		fruitSet.add("Apple"); // Duplicate, will be ignored
        fruitSet.add(null);	// Only One time allowed to set null value
        fruitSet.add(null);
        
        Iterator<String> itr= fruitSet.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}

}
