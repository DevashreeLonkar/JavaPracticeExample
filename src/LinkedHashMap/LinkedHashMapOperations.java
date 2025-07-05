package LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.omg.CosNaming.IstringHelper;

public class LinkedHashMapOperations {

	public static void main(String[] args) {
		
		 // 1. Creating a LinkedHashMap (Maintains Insertion Order)
		LinkedHashMap<Integer, String> list= new LinkedHashMap<>();
		
		// 2. Adding Elements
		list.put(1, "Apple");
		list.put(2, "Banana");
		list.put(3, "Cherry");
		list.putIfAbsent(4, "Date");
		list.put(5, "Orange");
		
		  // 3. Retrieving Elements
		System.out.println("Value of key 2: " +list.get(2));
		System.out.println("Value of key 5 or default: " +list.getOrDefault(5, "Default"));

		// 4. Checking Existence
		System.out.println("Contains key 1: " +list.containsKey(1));
		System.out.println("Contains value: " +list.containsValue("Date"));
		
		  // 5. Updating Elements
		list.replace(3, "Blueberry");
		System.out.println(list);
		
		// 6. Removing Elements
		list.remove(5);
		System.out.println(list);
		
		// 7 Iterating Over Entries
		System.out.println("Iterating using for each");
		list.forEach((key, value) ->System.out.println("Key " +key+ " Value "+value));
		
		// 8 Iterating using entry set
		System.out.println("Iterating using entry set");
	    for(Map.Entry<Integer, String> entry: list.entrySet()) {
	    	System.out.println(entry.getKey() + "-> " +entry.getValue());
	    }
		
	    // 9 Getting Size
	    System.out.println(list.size());  
	    
	    // 10 Checking If Empty
	    System.out.println(list.isEmpty());
	    
	    // 11 Cloning a LinkedHashMap
	    LinkedHashMap<Integer, String> clone= (LinkedHashMap<Integer, String>) list.clone();
	    System.out.println(clone);
	    
	    // 12 Using compute(), computeIfAbsent(), computeIfPresent()
	    
	    System.out.println(list.compute(2, (key,value) -> value + " Updated"));
	    System.out.println(list.computeIfAbsent(1, key-> "Green Apple"));
	    System.out.println(list.computeIfPresent(3, (key, value) ->value + " Modified"));
	    System.out.println("\nLinkedHashMap after compute operations: " + list);

        // 12. Replacing All Elements
	    list.replaceAll((key, value) -> value.toUpperCase());
	    System.out.println(list);
	    
	    // 13. Clearing All Elements
	    list.clear();
	    System.out.println("Size after clearing: " +list.size());
	}

}
