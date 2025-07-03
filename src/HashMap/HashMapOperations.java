package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapOperations {

	public static void main(String[] args) {
		// 1. Creating a HashMap
		HashMap<Integer, String> map= new HashMap<>();
		
		// 2. Adding Elements
		map.put(1, "Ram");
		map.put(2, "Sham");
		map.put(3, "Raj");
		map.putIfAbsent(4, "Riya"); //puts only if key is absent
		map.put(5, "Bob");
		
		// 3. Retrieving Elements
		System.out.println("Get key 1: " +map.get(1));
		System.out.println("Get 5 or default: " +map.getOrDefault(3, "Default name"));
		
		// 4. Checking for Existence
		System.out.println("Contains 1 key?: "+map.containsKey(1));
		System.out.println("Contains value Raj?: " +map.containsValue("Raj"));
		
		// 5. Updating Values
		map.replace(2, "Saloni");
		System.out.println("After replacing 2 : " +map);
		
		// 6. Removing Elements
		map.remove(map.remove(5));
		System.out.println("After removing 5 : " +map);
		
		 // 7. Iterating Over HashMap
		System.out.println("Iterating using forEach");
		map.forEach((key, value) ->System.out.println(key +"-" +value));
		
		System.out.println("Iterating using entrySet");
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+ " - " +entry.getValue());
		}
		
		 // 8. Getting Size of HashMap
		System.out.println("Size of map: "+map.size());
		
		// 9. Checking if HashMap is Empty
		System.out.println("Is HashMap empty: " +map.isEmpty());
		
		// 10. Clearing HashMap
//		map.clear();
//		System.out.println("After clearing a HashMap: " +map);
		
		// 11. Cloning HashMap
		map.put(6, "David");
		map.put(7, "Elena");
		Map<Integer, String> mapClone= (HashMap<Integer, String>) map.clone();
		System.out.println("After cloning: " +mapClone);
		
		// 12. Merging Values //concatinate
		map.merge(8, "Smith", (oldValue, newValue) ->oldValue+newValue);
		System.out.println("After merging 8th value is: " +map.get(8));
		
		// 13. Using compute, computeIfAbsent, computeIfPresent
		map.compute(6, (key, value) -> value+ " Updated");
		map.computeIfAbsent(5, key ->"New Value");
		map.computeIfPresent(1, (key, value) -> key + " Modified");
		
		System.out.println("After modifying all values: " +map);
		
		// 14. Replacing All Elements
		map.replaceAll((key, value)-> value.toUpperCase());
		System.out.println("After replacing: " +map);
	}

}
